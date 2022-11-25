package PageClass.PageClass_WithBaseCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserNameLoginClass {

    private WebDriver ldriver;


    public UserNameLoginClass(WebDriver gdriver){
        ldriver=gdriver;
    }

    By Username = By.id("login-username");
    By Password = By.id("login-password");
    By loginbutton= By.id("login-button");


    private WebElement getUsername(){
        return ldriver.findElement(Username);

    }

    private WebElement getPassword(){
        return ldriver.findElement(Password);

    }
    private WebElement loginButtton(){
        return ldriver.findElement(loginbutton);

    }

    public void WriteUsername(String USername){

        getUsername().sendKeys(USername);
    }
    public void WritePassword(String Pass){

        getPassword().sendKeys(Pass);
    }
    public void clickLoginButton(){

   loginButtton().click();
    }


}
