package PageClass.Spotify_muzikAcma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login_UserNameAndPassword {

    private WebDriver ldriver;

    public login_UserNameAndPassword(WebDriver gdriver){
        ldriver=gdriver;

    }
    By UserName         = By.id("login-username");
    By LoginPassword = By.id("login-password");

    By LoginClickButton = By.id("login-button");

    private WebElement getLogin(){
        return ldriver.findElement(UserName);
    }
    private WebElement getPassword(){
        return ldriver.findElement(LoginPassword);
    }

    private WebElement getButton(){
        return ldriver.findElement(LoginClickButton);
    }

    public void WriteUserName(String Username){
        getLogin().sendKeys(Username);
    }

    public void WritePassword(String Password){
        getPassword().sendKeys(Password);
    }
    public void ClickLoginButton(){
        getButton().click();
    }

}
