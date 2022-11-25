package step_definitions.definetionsss;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class GoogleSearchSteps {
    WebDriver driver = null;
    protected WebDriver ldriver;

    public GoogleSearchSteps(WebDriver gdriver){
        ldriver=gdriver;
    }
   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
    @Given("borwser is open")
    public void borwser_is_open() {
        System.out.println("inside step - browser is open");
//        System.setProperty("webdriver.opera.driver","")
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    By txt_SearchButAmazon = By.id("twotabsearchtextbox");
    @And("user is on google search page")
    public void user_is_on_google_search_page() {
        System.out.println("inside step -  user in on google search page ");
        driver.get("https://www.amazon.com.tr");

    }
    @When("user enters a text  search box")
    public void user_enters_a_text_search_box(String username ) {
        System.out.println("inside step - user enters a text in search box");
        ldriver.findElement(txt_SearchButAmazon).sendKeys();

    }
    @And("hits enter")
    public void hits_enter() {
        System.out.println("inside step - hits enter");
        wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

    }
    @Then("user is navigated to search result")
    public void user_is_navigated_to_search_result() {
        System.out.println("inside step -  user is navigated to search results");
    }}


