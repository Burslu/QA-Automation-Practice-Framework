package selenium_30_09_TestPractice.TopluKlasor;

import Base.BaseClassTestORnek02;
import PageClass.PageClass_WithBaseCase.HomePage;
import PageClass.PageClass_WithBaseCase.SearchMusicAndFindClick;
import PageClass.PageClass_WithBaseCase.UserNameLoginClass;
import PageClass.PageClass_WithBaseCase.Click_last_Step;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class seleniumUseWithBaseClass extends BaseClassTestORnek02 {


   @Test
    public void Test(){

       driver.get("https://open.spotify.com");
       Assert.assertTrue(true);
       Assert.assertTrue(true);
       Assert.assertTrue(true);
       Assert.assertTrue(false);
       //   WebDriver wait = (WebDriver) new WebDriverWait(driver, Duration.ofSeconds(5));
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
       HomePage HomePage = new HomePage(driver);
       HomePage.ClickLoginButton();
      UserNameLoginClass userNameClas = new UserNameLoginClass(driver);
//      wait.until(ExpectedConditions.);
      userNameClas.WriteUsername("iberkayuslu_41@hotmail.com");
      userNameClas.WritePassword("123789465Bb");
      userNameClas.clickLoginButton();
      SearchMusicAndFindClick musicBut = new SearchMusicAndFindClick(driver);
      musicBut.ClickMusicBox();
       Click_last_Step click = new Click_last_Step(driver);
       click.Click();



   }

}
