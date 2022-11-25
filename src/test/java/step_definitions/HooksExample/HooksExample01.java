package step_definitions.HooksExample;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class HooksExample01 {

    WebDriver driver=null;
    @Before(order = 1)
public void setup(){
        System.out.println("I am inside browserSetup");
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
    driver.manage().window().maximize();
}
@Before(order = 0)
public void setup2(){
    System.out.println("i am in side setup2");
}
@After
public void teardown(){
    System.out.println("I am inside teardown");
        driver.close();
        driver.quit();
}
@BeforeStep
public void beforeStep(){
    System.out.println("I am in side beforeStep");
}
@AfterStep
public void afterStep(){
    System.out.println("I am in side aftermetod");
}




    @Given("user is login")
    public void user_is_login() {

    }
    @When("user enter username and password")
    public void user_enter_username_and_password() {

    }
    @And("clicks on login button")
    public void clicks_on_login_button() {

    }
    @Then("user is navigetted  to the page")
    public void user_is_navigetted_to_the_page() {

    }
}
