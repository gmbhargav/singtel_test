package com.automation.config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang.NotImplementedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

/**
 * The BrowserLib Class implements an application that
 * help to Launch WebDriver for the different drivers
 *
 * @author Bhargava Mummaneedi
 * @version 1.0
 * @since 25/04/2021
 */

public class BrowserLib {
    private static final Logger LOGGER = LoggerFactory.getLogger(BrowserLib.class);
    public static WebDriver selectedDriver = null;

    public static WebDriver setUp() {
        String desiredBrowser = System.getProperty("browser", "chrome");
        switch (desiredBrowser) {
            case "chrome":
                LOGGER.info("************Launching Chrome Browser**********");
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                selectedDriver = new ChromeDriver(chromeOptions);
                break;
            case "chrome-headless":
                LOGGER.info("************Launching Chrome Headless Browser**********");
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless");
                options.addArguments("--remote-debugging-port=9222");
                options.addArguments("--disable-gpu");
                options.addArguments("--window-size=1920,1080");
                selectedDriver = new ChromeDriver(options);
                break;
            case "firefox":
                LOGGER.info("************Launching Firefox Browser**********");
                WebDriverManager.firefoxdriver().setup();
                selectedDriver = new FirefoxDriver();
                break;
            default:
                throw new NotImplementedException("Desired Browser is not Found");
        }
        LOGGER.info("-------Execution Started-------");
        selectedDriver.manage().window().maximize();
        selectedDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        selectedDriver.get("http://todomvc.com/examples/vue/");
        return selectedDriver;
    }


    public static void launchUrl(String url) {
        LOGGER.info("** Launching to " + url + "***");
        selectedDriver.navigate().to(url);
    }

    public static WebDriver getDriver() {
        return selectedDriver;
    }

    public static void tearDown() {
        selectedDriver.quit();
    }

}

