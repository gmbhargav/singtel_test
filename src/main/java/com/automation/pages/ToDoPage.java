package com.automation.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ToDoPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(ToDoPage.class);
    WebDriver driver;
    WebDriverWait webDriverWait;
    public int actNumberOfItems;

    public ToDoPage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.webDriverWait = new WebDriverWait(driver, 30);
    }

    @FindBy(className = "new-todo")
    WebElement inputNewTodo;

    @FindBy(xpath = "//li[contains(@class,'todo')]")
    List<WebElement> listTasks;

    @FindBy(className = "todo")
    List<WebElement> listActiveTasks;

    @FindBy(xpath = "//li[contains(@class,'todo')]//label")
    List<WebElement> labelsTasks;

    @FindBy(xpath = "//li[contains(@class,'todo')]//input[@type='checkbox']")
    List<WebElement> checkboxTasksList;

    @FindBy(xpath = "//span[@class='todo-count']/strong")
    WebElement labelItemsLeft;

    @FindBy(xpath = "//ul[@class='filters']//a[text()='All']")
    WebElement linkAllFilter;

    @FindBy(xpath = "//ul[@class='filters']//a[text()='Active']")
    WebElement linkActiveFilter;

    @FindBy(xpath = "//ul[@class='filters']//a[text()='Completed']")
    WebElement linkCompletedFilter;

    @FindBy(xpath = "//button[normalize-space()='Clear completed']")
    WebElement btnClearCompleted;

    @FindBy(xpath = "//li[@class='todo editing']//input[@class='edit']")
    WebElement inputRenameTask;

    @FindBy(xpath = "//label[text()='Mark all as complete']")
    WebElement btnMarkAllCompleted;

    public boolean addTask(String task) {
        boolean flag = false;
        try {
            waitTillElementIsPresent(inputNewTodo);
            inputNewTodo.sendKeys(task);
            inputNewTodo.sendKeys(Keys.ENTER);
            waitTillElementIsPresent(labelItemsLeft);
            actNumberOfItems = Integer.valueOf(labelItemsLeft.getText());
            if (actNumberOfItems > 0) {
                flag = true;
            }
        } catch (Exception e) {
            LOGGER.error("Exception {} while adding task {}", e.toString(), task);
        }
        return flag;
    }

    public boolean verifyTaskDisplayed(String task) {
        boolean flag = false;
        String actTask;
        try {
            for (WebElement element : labelsTasks) {
                actTask = element.getText().trim();
                if (actTask.equalsIgnoreCase(task)) {
                    flag = true;
                    break;
                }
            }
        } catch (Exception e) {
            LOGGER.error("Exception {} while verifying task {}", e.toString(), task);
        }
        return flag;
    }

    public boolean verifyTaskDisplayed(String task, String filter) {
        boolean flag = false;
        String actTask;
        String locator = "//ul[@class='filters']//a[text()='" + filter + "']";
        try {
            this.driver.findElement(By.xpath(locator)).click();
            for (WebElement element : labelsTasks) {
                actTask = element.getText().trim();
                LOGGER.info("Actual Task name {} ", actTask);
                if (actTask.equalsIgnoreCase(task)) {
                    flag = true;
                    LOGGER.info("Actual Task name {}, expected task name {} ", actTask, task);
                    break;
                }
            }
        } catch (Exception e) {
            LOGGER.error("Exception {} while verifying task {}", e.toString(), task);
        }
        return flag;
    }

    public boolean selectFilter(String filter) {
        boolean flag = false;
        String locator = "//ul[@class='filters']//a[text()='" + filter + "']";
        try {
            this.driver.findElement(By.xpath(locator)).click();
            flag = true;
        } catch (Exception e) {
            LOGGER.error("Exception {} while selecting filter {}", e.toString(), filter);
        }
        return flag;
    }

    public boolean completeTask(String task) {
        boolean flag = false;
        String locator = "//label[text()='" + task + "']/preceding-sibling::input[@type='checkbox']";
        try {
            this.driver.findElement(By.xpath(locator)).click();
            flag = true;
        } catch (Exception e) {
            LOGGER.error("Exception {} while completing task {}", e.toString(), task);
        }
        return flag;
    }

    public boolean renameTask(String task, String newTask) {
        boolean flag = false;
        String locator = "//li[contains(@class,'todo')]//label[text()='" + task + "']";
        try {
            Actions action = new Actions(driver);
            action.moveToElement(driver.findElement(By.xpath(locator)))
                    .doubleClick().build().perform();
            LOGGER.info("double clicked");
            for (int i = 0; i < 50; i++) {
                inputRenameTask.sendKeys(Keys.BACK_SPACE);
            }
            inputRenameTask.sendKeys(newTask);
            inputRenameTask.sendKeys(Keys.ENTER);
            flag = true;
        } catch (Exception e) {
            LOGGER.error("Exception {} while renaming task {}", e.toString(), task);
        }
        return flag;
    }

    public boolean verifyTaskAsCompleted(String task) {
        boolean flag = false;
        String actTask;
        String locator = "//label[text()='" + task + "']/ancestor::li";
        try {
            WebElement element = this.driver.findElement(By.xpath(locator));
            waitTillElementIsPresent(element);
            if (element.getAttribute("class").contains("completed")) {
                flag = true;
            }
        } catch (Exception e) {
            LOGGER.error("Exception {} while verifying task {}", e.toString(), task);
        }
        return flag;
    }

    public int getNumberOfItemsLeft() {
        waitTillElementIsPresent(labelItemsLeft);
        return Integer.valueOf(labelItemsLeft.getText());
    }

    public boolean verifyNumberOfItemsLeftDisplayed() {
        waitTillElementIsPresent(labelItemsLeft);
        return (labelItemsLeft.isDisplayed());
    }

    public boolean clearCompletdTask() {
        boolean flag = false;
        try {
            btnClearCompleted.click();
            flag = true;
        } catch (Exception e) {
            LOGGER.error("Exception {} clearing completed tasks", e.toString());
        }
        return flag;
    }


    public boolean waitTillElementIsPresent(WebElement element) {
        try {
            webDriverWait
                    .ignoring(NoSuchElementException.class)
                    .ignoring(StaleElementReferenceException.class)
                    .until(ExpectedConditions.visibilityOf(element));
        } catch (TimeoutException e) {
            return false;
        }
        return true;
    }

    public boolean markAllTaskAsCompleted() {
        boolean flag = false;
        try {
            waitTillElementIsPresent(btnMarkAllCompleted);
            btnMarkAllCompleted.click();
            flag = true;
        } catch (Exception e) {
            LOGGER.error("Exception {} marking all tasks as completed", e.toString());
        }
        return flag;
    }

    public boolean verifyAllTaskAsCompleted() {
        boolean flag = false;
        try {
            waitTillElementIsPresent(listTasks.get(0));
            for (WebElement element : listTasks) {
                if (element.getAttribute("class").contains("completed")) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
        } catch (Exception e) {
            LOGGER.error("Exception {} while verifying task {}", e.toString());
        }
        return flag;
    }

    public int getActiveTasks() {
        return listActiveTasks.size();
    }
}
