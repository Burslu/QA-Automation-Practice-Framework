package PageClass.SpotifyPageClass01;

import Base.Spotify_Base_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class Spotify_PageClass01 extends Spotify_Base_Class {
    private WebDriver ldriver;


    public Spotify_PageClass01(WebDriver gdriver){
        ldriver=gdriver;
    }
    By loginBut           = By.xpath("(//*[@class='Button-qlcn5g-0 lcCooU'])[1]");
    By mailAdressLogin    = By.id("login-username");
    By passwordLogin      = By.id("login-password");
    By loginButMainPage   = By.id("login-button");
    By acount             = By.xpath("//*[@class='odcjv30UQnjaTv4sylc0']");
    By searchBut          =By.linkText("Search");
    By wrongLogin         =By.xpath("//*[text()='Incorrect username or password.']");
    private WebElement getLoginBut(){

        return ldriver.findElement(loginBut);
    }
    private WebElement getMailAdress(){
        return ldriver.findElement(mailAdressLogin);
    }
    private WebElement getPasswordLogin(){
        return ldriver.findElement(passwordLogin);
    }
    private WebElement getLoginButMainPage(){
        return ldriver.findElement(loginButMainPage);
    }
    private WebElement getAcount(){
        return ldriver.findElement(acount);
    }
    private WebElement getsearchBut(){
        return ldriver.findElement(searchBut);
    }
    private WebElement getWrongLoginTest(){
        return ldriver.findElement(wrongLogin);
    }

    public void workTestLoginBut(){

        getLoginBut().click();
    }
    public void clickLoginMailBut(String mailAdressId){

        getMailAdress().sendKeys(mailAdressId);
    }
    public void clickPasswordButton(String password){

        getPasswordLogin().sendKeys(password);
    }

    public void clickLoginBut(){
        getLoginButMainPage().click();
        Assert.assertTrue(getAcount().getAttribute("data-testid").contains("user-widget-link"));
    }
    public void wrongClickLoginBut(){
        getLoginButMainPage().click();
        Assert.assertFalse(getWrongLoginTest().getAttribute("class").contains("Incorrect username or password."));
    }
    public void clickSearchButton(){
        getsearchBut().click();
        wait.until(ExpectedConditions.urlToBe("https://open.spotify.com/search"));
        Assert.assertEquals(ldriver.getCurrentUrl(),"https://open.spotify.com/search");

    }


}
