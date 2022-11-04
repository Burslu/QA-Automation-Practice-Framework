package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class StepDef {
    WebDriver driver;
    @Given("I open browser")
    public void i_open_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/watch?v=RzCzvCAyzC8");

    }

    @Then("i navigate to google")
    public void i_navigate_to_google() {
        driver.get("https://www.google.com");
    }
}
