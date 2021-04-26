package com.automation.stepdefs;

import com.automation.config.BrowserLib;
import com.automation.pages.ToDoPage;
import com.automation.utils.LoggerUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ToDoTaskStepDef {
    private static final Logger LOGGER = LoggerFactory.getLogger(ToDoTaskStepDef.class);
    WebDriver driver;
    ToDoPage toDoPage;
    LoggerUtil loggerUtil;
    Scenario scenario;

    public ToDoTaskStepDef() {
        this.driver = BrowserLib.getDriver();
        this.toDoPage = new ToDoPage(driver);
        loggerUtil = new LoggerUtil();
    }

    @Before
    public void setUp(Scenario scenario) {
        loggerUtil.configureLogging();
        LOGGER.info("-------Session Started-------");
    }

    @Given("I launch the MVC site")
    public void i_launch_the_MVC_site() {
        BrowserLib.launchUrl("http://todomvc.com/examples/vue/");
    }

    @When("I Add {string} Todo task")
    public void i_Add_Todo_task(String task) {
        Assert.assertTrue("Unable to add task", toDoPage.addTask(task));
        LOGGER.info("Task {} added successfully", task);
    }

    @Given("I select {string} filter")
    public void i_select_tasks(String filter) {
        Assert.assertTrue("Unable to select filter", toDoPage.selectFilter(filter));
        LOGGER.info("Filter {} selected as expected ", filter);
    }

    @When("I clear all completed tasks")
    public void i_clear_completed_tasks() {
        Assert.assertTrue("Unable to clear completed tasks", toDoPage.clearCompletdTask());
        LOGGER.info("Cleared all completed tasks as expected ");
    }

    @Then("I should see {string} task marked as completed")
    public void i_should_see_task_marked_as_completed(String task) {
        Assert.assertTrue("Unable to see task as completed", toDoPage.verifyTaskAsCompleted(task));
        LOGGER.info("Task {} marked as completed as expected", task);
    }

    @Then("I should see {string} task available under {string} todo list")
    public void i_should_see_task_available_under_todo_list(String task, String filter) {
        Assert.assertTrue("Unable to verify task", toDoPage.verifyTaskDisplayed(task, filter));
        LOGGER.info("Task {} displayed as expected under {} filter", task, filter);
    }

    @Then("I should see number of items left count is matching with active tasks")
    public void i_should_see_active_tasks_matching_with_items_left() {
        int numOfItemLeft = toDoPage.getNumberOfItemsLeft();
        int numOfActiveTasks=toDoPage.getActiveTasks();
        Assert.assertTrue("number of items left count not matching", numOfItemLeft == numOfActiveTasks);
        LOGGER.info("Number of items left count matching expected {} actual {}", numOfActiveTasks, numOfItemLeft);

    }

    @Then("I should see number of items left count {string} by {int}")
    public void i_should_see_number_of_items_count_by(String type, Integer cnt) {
        int numOfItemLeft = toDoPage.getNumberOfItemsLeft();
        int expectedNumberOfItems;
        if (type.toLowerCase().contains("increase")) {
            expectedNumberOfItems = toDoPage.actNumberOfItems + cnt;
        } else {
            expectedNumberOfItems = toDoPage.actNumberOfItems - cnt;
        }
        Assert.assertTrue("number of items left count not matching", numOfItemLeft == expectedNumberOfItems);
        LOGGER.info("Number of items left count matching expected {} actual {}", expectedNumberOfItems, numOfItemLeft);
    }

    @Then("I should see number of items left displayed")
    public void i_should_see_number_of_items() {
        Assert.assertTrue("Number of items left count not displayed ", toDoPage.verifyNumberOfItemsLeftDisplayed());
        LOGGER.info("Number of items left count displayed as expected ");
    }

    @When("I select {string} Todo task as completed")
    public void i_select_Todo_task_as_completed(String task) {
        Assert.assertTrue("Unable to mark task as completed", toDoPage.completeTask(task));
        LOGGER.info("Task {} marked as completed as expected", task);
    }

    @Then("I should see {string} task not available under {string} todo list")
    public void i_should_see_task_not_available_under_todo_list(String task, String filter) {
        Assert.assertFalse("Unable to verify task", toDoPage.verifyTaskDisplayed(task, filter));
        LOGGER.info("Task {} not displayed as expected under {} filter", task, filter);
    }

    @When("I rename {string} Todo task as {string}")
    public void i_rename_Todo_task(String task,String newTask) {
        Assert.assertTrue("Unable to rename task", toDoPage.renameTask(task,newTask));
        LOGGER.info("Task {} renamed as expected", task);
    }

    @When("I mark all tasks as completed")
    public void i_mark_all_tasks_as_completed() {
        Assert.assertTrue("Unable to mark tasks as completed", toDoPage.markAllTaskAsCompleted());
        LOGGER.info("All Tasks marked as completed as expected");
    }

    @Then("I should see all tasks marked as completed")
    public void i_should_see_all_task_marked_completed() {
        Assert.assertTrue("All tasks not marked as completed ", toDoPage.verifyAllTaskAsCompleted());
        LOGGER.info("All tasks marked as completed as expected ");
    }

    @Then("I should see {int} number of items left displayed")
    public void i_should_n_see_number_of_items(int count) {
        int numOfItemLeft = toDoPage.getNumberOfItemsLeft();
        Assert.assertTrue("number of items left count not matching", numOfItemLeft == count);
        LOGGER.info("Number of items left count matching expected {} actual {}", count, numOfItemLeft);
    }

    @After
    public void tearDown(Scenario scenario) {
            final byte[] screenshot = ((TakesScreenshot) this.driver).getScreenshotAs(OutputType.BYTES);
            String screenShotName=scenario.getName().replaceAll(" ", "_");
            scenario.attach(screenshot, "image/png",screenShotName); // ... and embed it in the report.
        LOGGER.info("-------Screen shot added-------");
    }

}
