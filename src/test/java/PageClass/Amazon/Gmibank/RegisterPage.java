package PageClass.Amazon.Gmibank;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class RegisterPage {
    private WebDriver ldriver;



    public RegisterPage(WebDriver gdriver){
        ldriver=gdriver;
    }


    By ssnButton = By.id("ssn");
    By verifyEror = By.xpath("//div[text()='Ssn is invalid.']");
    By firsName = By.id("firstname");
    By verifyErorFirtName = By.xpath("//*[text()='Please enter your first name.']");


    private WebElement getssnButton(){
        return ldriver.findElement(ssnButton);
    }
    private WebElement getFirtName(){
        return ldriver.findElement(firsName);
    }
    private WebElement getVerifyErorMassege(){
        return ldriver.findElement(verifyEror);
    }
    private  WebElement getVerifyErorFirstName(){
        return ldriver.findElement(verifyErorFirtName);
    }

    public void clickAndSendkeysssnButton(String id){
        getssnButton().sendKeys(id);
        getssnButton().sendKeys(Keys.TAB);

    }
    public void verifyErorMassage(){
        Assert.assertTrue(getVerifyErorMassege().isDisplayed());
    }

    public void sendFirstName(String firtName){
       getFirtName().sendKeys(firtName);

    }
    public void VerifyErorFirtName(){

        Assert.assertTrue(getVerifyErorFirstName().isDisplayed());
    }

}
