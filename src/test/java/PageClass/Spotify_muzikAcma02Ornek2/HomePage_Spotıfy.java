package PageClass.Spotify_muzikAcma02Ornek2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage_Spotıfy {


    private WebDriver ldirver;

    public HomePage_Spotıfy(WebDriver ddriver){
        ldirver=ddriver;

    }
    By userName = By.id("login-username");

    By userPassword = By.id("login-password");

    By userLoginBut = By.id("login-button");




    private WebElement getUsername(){
        return ldirver.findElement(userName);
    }
    private WebElement getPassword(){
        return ldirver.findElement(userPassword);
    }
    private WebElement getLogin(){
        return ldirver.findElement(userLoginBut);
    }



    public void LoginUsername(String userName){
        getUsername().sendKeys(userName);
    }
    public void LoginPassword(String password){
        getPassword().sendKeys(password);
    }
    public void LoginButton(){
        getLogin().click();
    }



}
