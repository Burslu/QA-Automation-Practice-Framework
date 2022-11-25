package step_definitions.definetionsss;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class StepDef02 {
    WebDriver driver;
    @Given("print {string}")
    public void printx(String string) {
        System.out.println(string);
    }

    @Given("I open browser and navigate youtube")
    public void i_open_browser_and_navigate_youtube() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/watch?v=RzCzvCAyzC8");
    }
    @Given("I open browser and navigate google")
    public void i_open_browser_and_navigate_google() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }

    @When("users enters a text  search box <username>")
    public void usersEntersATextSearchBoxUsername() {
    }
}
