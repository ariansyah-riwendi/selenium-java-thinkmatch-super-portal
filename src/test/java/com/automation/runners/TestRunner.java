package com.automation.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.automation.hooks", "com.automation.steps"},
        plugin = {
                "pretty",
                "html:target/cucumber-report/cucumber-report.html",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        tags = "@Dashboard"
)

public class TestRunner extends AbstractTestNGCucumberTests {
}
