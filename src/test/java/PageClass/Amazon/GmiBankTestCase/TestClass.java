package PageClass.Amazon.GmiBankTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TestClass {

    private WebDriver ldriver;


    public TestClass(WebDriver griver){
        ldriver=griver;
    }

    By ssnButton         = By.id("ssn");
    By ssnErrorMsg       = By.id("ssn");
    By fırstNameBut      = By.id("firstname");
    By firstNameErrorMsg = By.xpath("//*[text()='Please enter your first name.']");
    By lastNamebut       = By.id("lastname");
    By lastNameErormsg   = By.xpath("//div[text()='Please enter your last name.']");
    By adress            =By.id("address");

    By phoneNumber       =By.id("mobilephone");






    private WebElement getssn(){

        return ldriver.findElement(ssnButton);
    }

    private WebElement getSsnErrorMsg(){
        return ldriver.findElement(ssnErrorMsg);
    }
    private WebElement getFirstNameBut(){
        return ldriver.findElement(fırstNameBut);
    }
    private WebElement getFirstNameErorBut(){

        return ldriver.findElement(firstNameErrorMsg);
    }
    private  WebElement getLastNamebut(){
        return ldriver.findElement(lastNamebut);
    }
    private WebElement getLastNameErormsg(){
        return ldriver.findElement(lastNameErormsg);
    }
    private WebElement getAdress(){
        return ldriver.findElement(adress);
    }
    private WebElement getPhoneNumber(){
        return ldriver.findElement(phoneNumber);
    }








    //              SSN TEST
    public void sendCorrectSSN(String id){
        getssn().sendKeys(id + Keys.TAB);
        Assert.assertTrue(getssn().getAttribute("class").contains("is-touched is-dirty av-valid form-control"));
    }

    public void sendWrongSSN(String idEror){
        getssn().sendKeys(idEror + Keys.TAB);
        Assert.assertTrue(getSsnErrorMsg().isDisplayed());
    }
    //               FIRST NAME TEST
    public void sendCorrectFirstName(String firstName){
        getFirstNameBut().sendKeys(firstName+Keys.TAB);
        Assert.assertFalse(getFirstNameBut().getAttribute("class").contains("av-invalid"));
    }
    public void sendWrongFirstName(String firstErorName)  {
       getFirstNameBut().sendKeys(firstErorName+Keys.TAB);
        Assert.assertTrue(getFirstNameErorBut().isDisplayed());
    }
    //                LAST NAME TEST
    public void sendlastNameCorrect(String lastName){
        getLastNamebut().sendKeys(lastName+Keys.TAB);
        Assert.assertFalse(getLastNamebut().getAttribute("class").contains("is-touched is-dirty av-invalid is-invalid form-control"));
    }
    public void sendlastNameWrong(String lastWrongName) throws InterruptedException {
        getLastNamebut().sendKeys(lastWrongName+Keys.ENTER);
        Thread.sleep(2000);
        Assert.assertTrue(getLastNameErormsg().isDisplayed());
    }
    //                 ADRESS TESTI
    public void clickAndMoreAdress(String Adress){
        getAdress().sendKeys(Adress+Keys.TAB);
        Assert.assertTrue(getAdress().getAttribute("class").contains("is-touched is-dirty av-valid form-control"));
    }
    public void wrongAdress(String wrongAdress){
        getAdress().sendKeys(wrongAdress+Keys.TAB);
        Assert.assertTrue(getAdress().getAttribute("class").contains("av-invalid"));
    }
    //                  PHONE NUMBER
    public void corrctPhoneNumber(String correctNumber){

        getPhoneNumber().sendKeys(correctNumber);
        Assert.assertFalse(getPhoneNumber().getAttribute("class").contains("av-invalid"));
    }
    public void wrongNumber(String wrongNumber){
        getPhoneNumber().sendKeys(wrongNumber);
        Assert.assertTrue(getPhoneNumber().getAttribute("class").contains("av-invalid"));
    }









}
