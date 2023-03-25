package step_definitions.definetionsss;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import step_definitions.Pages.LoginPage;

import java.time.Duration;

public class GoogleSearchStep02 {

    protected WebDriver ldriver;
    ///WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

    LoginPage lp;


    @Given("borwsers is open")
    public void borwsersIsOpen() {

        WebDriverManager.chromedriver().setup();
        ldriver = new ChromeDriver();
        ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        ldriver.manage().window().maximize();

    }

    @And("users is on google search page")
    public void usersIsOnGoogleSearchPage() {
        ldriver.get("https://accounts.spotify.com/en/login?continue=https%3A%2F%2Fopen.spotify.com%2F");
        lp = new LoginPage(ldriver);

    }


 @When("users enters a text  search box")
 public void usersEntersATextSearchBox() {

        lp.enterPassword("123789465B");
    }
    @When("users enters username {string}")
    public void users_enters_a_text_search_box(String string) {

        lp.enterUsername(string);
    }
    @When("users enters password {string}")
    public void usersEntersATextSearchBoxx(String string) {

        lp.enterPassword(string);
    }

    @And("hitss enter")
    public void hitssEnter() {
        lp.clickSearcbuttxt();
    }

    @Then("users is navigated to search result")
    public void usersIsNavigatedToSearchResult() {

    }



//"^users enters a text  search box \"(.*)\"$"

}
