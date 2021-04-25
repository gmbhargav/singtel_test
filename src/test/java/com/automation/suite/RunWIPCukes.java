package com.automation.suite;

import com.automation.config.BrowserLib;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"com.automation.stepdefs"},
        features = {"src/test/resources/features"},
        plugin = {"pretty",
                "html:target/cucumber-default-report",
                "summary",
                "json:target/cucumber-advanced-reports/cucumber.json"},
        monochrome = true,
        strict = true,
//        dryRun=true,
        tags = "@p1_test")
public class RunWIPCukes {

    @BeforeClass
    public static void launchDriver() {
        BrowserLib.setUp();
    }

    @AfterClass
    public static void tearDown() {
        BrowserLib.tearDown();
    }
}