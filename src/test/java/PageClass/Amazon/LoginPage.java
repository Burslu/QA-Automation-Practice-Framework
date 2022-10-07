package PageClass.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver ldriver;
    public LoginPage(WebDriver gdriver){ldriver=gdriver;}

    By txt_email     = By.id("ap_email");
    By btn_continue  =By.id("continue");
    By txt_passaport =By.id("ap_password");
    By btn_signin    =By.id("signInSubmit");
    private WebElement getTxtEmail(){
        return ldriver.findElement(txt_email);
    }
    private WebElement getButtonContinue(){
        return ldriver.findElement(btn_continue);
    }
    private WebElement gettxtPassoword(){
        return ldriver.findElement(txt_passaport);
    }
    private WebElement getBtnSignin(){
        return ldriver.findElement(btn_signin);
    }

    public void writeEmailMetod(String email){
        getTxtEmail().sendKeys(email);

    }
    public void clickcontinue(){
        getButtonContinue().click();


    }
    public void writePassword(String password){
        gettxtPassoword().sendKeys(password);


    }
    public void clicksignButton(){
        getBtnSignin().click();


    }


}

