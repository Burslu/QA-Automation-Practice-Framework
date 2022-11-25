package step_definitions.definetionsss;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        features = {"src/test/resources/features"},
        glue = {"step_definitions"},
        tags = "@Berkay"
        )

public class TestRunner_RunWithTags extends AbstractTestNGCucumberTests {



}
