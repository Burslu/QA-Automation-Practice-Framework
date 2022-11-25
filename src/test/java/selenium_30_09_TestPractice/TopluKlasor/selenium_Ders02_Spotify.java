package selenium_30_09_TestPractice.TopluKlasor;

import Base.BaseTest;
import PageClass.Spotify_muzikAcma.*;
import org.testng.annotations.Test;

public class selenium_Ders02_Spotify extends BaseTest {

    @Test
    public void Test(){

        driver.get("https://open.spotify.com");
        Home_Page_spotify spotify = new Home_Page_spotify(driver);
        spotify.clickLoginButton();
        login_UserNameAndPassword loginPage =new login_UserNameAndPassword(driver);
        loginPage.WriteUserName("iberkayuslu_41@hotmail.com");
        loginPage.WritePassword("123789465Bb");
        loginPage.ClickLoginButton();
        spotify_Search search = new spotify_Search(driver);
        search.ClickSearcButton();
        search.searchButton("chill");
        spotify_songOpenPage openPage = new spotify_songOpenPage(driver);
        openPage.ClickSongButton();
        Spotify_lastStepOpenSong lastStep = new Spotify_lastStepOpenSong(driver);
        lastStep.sonClickButton();
        lastStep.PlayButton();


    }
}

