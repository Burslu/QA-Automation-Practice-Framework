package step_definitions.definetionsss;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


    @CucumberOptions(
            features = {"src/test/resources/Hooks/Hooks.feature"},
            glue = {"step_definitions"}

    )

    public class testRunner_Hooks extends AbstractTestNGCucumberTests {




}
