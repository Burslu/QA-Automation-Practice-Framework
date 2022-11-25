package PageClass.Amazon.GmiBankTestCase;

import Base.GmibankBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class TestClass02 extends GmibankBaseClass {
    private WebDriver ldriver;

    //                                  password Test
    public TestClass02(WebDriver gdriver){
        ldriver=gdriver;
    }

    By passwordd            =By.id("firstPassword");
    By strengthBar          =By.id("strengthBar");

    By strengthBarElements  =By.xpath("//ul[@id = 'strengthBar']//li");
    By mail                 =By.id("email");
    By secondPassword       =By.id("secondPassword");

    private WebElement  getpassw(){
        return ldriver.findElement(passwordd);
    }
    private WebElement getStrenghtBar(){
        return ldriver.findElement(strengthBar);
    }

    private List<WebElement> getStrengthBarElements(){
        return ldriver.findElements(strengthBarElements);
    }
    private WebElement getEmail(){
        return ldriver.findElement(mail);
    }
    private WebElement getSecondPassword(){
        return ldriver.findElement(secondPassword);
    }

    public void wrongPassw(String password1){
        getpassw().sendKeys(password1);
        for (int i = 0; i < getStrengthBarElements().size(); i++) {
            Assert.assertFalse(getStrengthBarElements().get(i).getAttribute("style").contains("rgb(0, 255, 0)"));
            System.out.println(getStrengthBarElements().get(i).getAttribute("style"));

        }
    }
    public void correctPassw(String password2){
        getpassw().sendKeys(password2);
        for (int i = 0; i<getStrengthBarElements().size();i++){
            Assert.assertTrue(getStrengthBarElements().get(i).getAttribute("style").contains("rgb(0, 255, 0)"));
            System.out.println(getStrengthBarElements().get(i).getAttribute("style"));
        }
        //Assert.assertFalse(getStrengthBarElements().getAttribute("style").contains("background-color: rgb(255, 153, 0);"));
    }
    public void sendCorrctMail(String mail){
        getEmail().sendKeys(mail+ Keys.TAB);
        Assert.assertTrue(getEmail().isDisplayed());
    }
    public void sendWrongMail(String wrongMail){
        getEmail().sendKeys(wrongMail+Keys.TAB);
        Assert.assertFalse(getEmail().getAttribute("class").contains("av-invalid"));
    }
    public void controlCorrectSecondPassword(String secondPassword){
        getSecondPassword().sendKeys(secondPassword+Keys.TAB);
        Assert.assertFalse(getSecondPassword().getAttribute("class").contains("The password and its confirmation do not match!"));
    }
    public void controlWrongSecondPassword(String wrongsecondPassword){
        getSecondPassword().sendKeys(wrongsecondPassword);
        Assert.assertTrue(getSecondPassword().getAttribute("class").contains("The password and its confirmation do not match!"));
    }



}
