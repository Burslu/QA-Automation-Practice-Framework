package selenium_30_09.Spotify01;

import Base.Spotify_Base_Class;
import PageClass.SpotifyPageClass01.Spotify_PageClass01;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Spotify_Selenium01 extends Spotify_Base_Class{
    Spotify_PageClass01 sp = new Spotify_PageClass01(driver);


    @Test
    public void test01LoginBut(){
        Spotify_PageClass01 testLoginBut = new Spotify_PageClass01(driver);
        testLoginBut.workTestLoginBut();
        wait.until(ExpectedConditions.not(ExpectedConditions.urlToBe("https://open.spotify.com/")));
        Assert.assertEquals(driver.getCurrentUrl(),"https://accounts.spotify.com/en/login?continue=https%3A%2F%2Fopen.spotify.com%2F");
    }

    @Test // testPass
    public void test02MailAdressCorrect(){
        test01LoginBut();
        Spotify_PageClass01 testMailAdress = new Spotify_PageClass01(driver);
        testMailAdress.clickLoginMailBut("iberkayuslu_41@hotmail.com");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("login-username")));
        testMailAdress.clickPasswordButton("123789465Bb");
        testMailAdress.clickLoginBut();
    }

            // TestFaill
    @Test
    public void test03AcountLogin(){
        test01LoginBut();
        Spotify_PageClass01 testfailAdress = new Spotify_PageClass01(driver);
        testfailAdress.clickLoginMailBut("iberkayuslu_41@hotmail.com");
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("login-username")));
        testfailAdress.clickPasswordButton("123789465B");
        testfailAdress.wrongClickLoginBut();
    }
    @Test // testPass
    public void test03searchButton(){
        test01LoginBut();
        Spotify_PageClass01 testSearchButton = new Spotify_PageClass01(driver);
        testSearchButton.clickLoginMailBut("iberkayuslu_41@hotmail.com");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("login-username")));
        testSearchButton.clickPasswordButton("123789465Bb");
        testSearchButton.clickLoginBut();
        testSearchButton.clickSearchButton();
    }



}
