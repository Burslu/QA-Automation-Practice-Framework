package Base.FullTreuTestInstagram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.awt.dnd.DragGestureEvent;
import java.sql.Driver;

public class AmazonLoginPage {

    private WebDriver ldriver;


    public AmazonLoginPage (WebDriver gderiver){
        ldriver=gderiver;
    }

    By loginButton  = By.id("ap_email");
    By countinueBut = By.id("continue");
    By wrongUsername = By.id("auth-error-message-box");
    private WebElement getLoginBut(){
        return ldriver.findElement(loginButton);
    }
    private WebElement getCountiniueBut(){
        return ldriver.findElement(countinueBut);
    }
    private WebElement getWrongUsernamebut(){
        return ldriver.findElement(wrongUsername);
    }

    public void sendUserName(String username){
        getLoginBut().sendKeys(username);

    }
    public void clickCountinueBut(){
        getCountiniueBut().click();
        //Assert.assertEquals(ldriver.getCurrentUrl(),"https://www.amazon.com.tr/ap/signin");
    }


    public void verifySigninPageOpened(){
        Assert.assertEquals(ldriver.getCurrentUrl(), "https://www.amazon.com.tr/ap/signin");

    }

    // wrongTestBut
    public void clickWrongBut(){
        getCountiniueBut().click();
        Assert.assertTrue(getWrongUsernamebut().getAttribute("id").contains("auth-error-message-box"));

    }





}

