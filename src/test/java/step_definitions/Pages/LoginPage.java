package step_definitions.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver ldriver;

    public LoginPage(WebDriver gdriver){
        ldriver=gdriver;
    }
    By txt_loginUsernameBut = By.id("login-username");
    By txt_loginPasswordBut = By.id("login-password");
    By btn_loginContinueBut = By.id("login-button");


public void enterUsername(String username){

    getUsername().sendKeys(username);
}
public void enterPassword(String password){
    gettxt_loginPassword().sendKeys(password);
}


    //  By txt_SearchButAmazon = By.xpath("(//*[text()='Giriş yap'])[1]");


public WebElement getUsername(){
    return ldriver.findElement(txt_loginUsernameBut);
}
public WebElement gettxt_loginPassword(){
        return ldriver.findElement(txt_loginPasswordBut);
    }
    public WebElement getbtncountinue(){
        return ldriver.findElement(btn_loginContinueBut);
    }


public void clickSearcbuttxt(){
    getbtncountinue().click();
}




}
