package Base.FullTreuTestInstagram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class HomePageInstagramTest {

    private WebDriver ldriver;



    public HomePageInstagramTest(WebDriver gdriver){
        ldriver=gdriver;
    }
    By loginFormUserName = By.name("username");
    By loginFormPassword = By.xpath("//*[@type='password']");
    By registerButton    = By.xpath("//*[@type='submit']");
    By erorMassage       = By.id("slfErrorAlert");
    private WebElement getloginForm(){
        return ldriver.findElement(loginFormUserName);
    }
    private WebElement getPassword(){
        return ldriver.findElement(loginFormPassword);
    }
    private WebElement getRegisterButton(){
        return ldriver.findElement(registerButton);
    }
    private WebElement geterorMassege(){
        return ldriver.findElement(erorMassage);
    }



    public void loginFormFindAndSendUsername(String userName) {

        Actions action = new Actions(ldriver);
        action.moveToElement(getloginForm()).click().sendKeys(userName).build().perform();
    }
    public void LoginFormFindAndSendPassword(String Passwrod){
        Actions action = new Actions(ldriver);
        action.moveToElement(getPassword()).click().sendKeys(Passwrod).build().perform();
    }
    public void registerButtonClick(){
        getRegisterButton().click();
    }
    //Wrong Fail Test();
    public void loginWrongFindAndSendUsername(String userName,String Passwrod) throws InterruptedException {
        Actions action = new Actions(ldriver);
        action.moveToElement(getloginForm()).click().sendKeys(userName).build().perform();
        action.moveToElement(getPassword()).click().sendKeys(Passwrod).build().perform();
        getRegisterButton().click();
        Thread.sleep(5000);
        Assert.assertTrue( geterorMassege().getAttribute("id").contains("slfErrorAlert"));
    }

}
