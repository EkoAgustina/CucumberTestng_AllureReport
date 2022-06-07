package CucumberRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@Test()
@CucumberOptions(
        features = "src/test/resources/SwagLabs"
        ,glue = "stepDefinitions"
        ,plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
        ,tags = ""
        ,monochrome = true
        ,publish = true
)



public class TestRunner extends AbstractTestNGCucumberTests {
}
