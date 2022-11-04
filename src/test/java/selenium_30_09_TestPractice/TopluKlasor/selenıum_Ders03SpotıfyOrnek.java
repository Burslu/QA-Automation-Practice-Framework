package selenium_30_09.TopluKlasor;

import Base.BaseTest;
import PageClass.Spotify_muzikAcma02Ornek2.Find_new_SongPage;
import PageClass.Spotify_muzikAcma02Ornek2.HomePage_Spotıfy;
import PageClass.Spotify_muzikAcma02Ornek2.MainclassLogin;
import PageClass.Spotify_muzikAcma02Ornek2.open_Button;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.time.Duration;

public class selenıum_Ders03SpotıfyOrnek extends BaseTest {


    @Test

    public void Test(){
        Assert.assertTrue(!driver.getCurrentUrl().equals("https://www.gmibank.com"));
        driver.get("https://open.spotify.com");
        HomePage_Spotıfy homePage = new HomePage_Spotıfy(driver);
        MainclassLogin main = new MainclassLogin(driver);
        main.clickLoginButton();
        homePage.LoginUsername("iberkayuslu_41@hotmail.com");
        homePage.LoginPassword("123789465Bb");
        homePage.LoginButton();
        Find_new_SongPage find = new Find_new_SongPage(driver);
        find.clickButton();
        open_Button button = new open_Button(driver);
        button.clickPlayButton();


    }
}
