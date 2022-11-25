package PageClass.Amazon.PageClass_GmibankTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePageGmibank {

    private WebDriver ldriver;


    public HomePageGmibank(WebDriver gdriver){
        ldriver=gdriver;
    }
    By homePage = By.xpath("//*[@class='d-flex align-items-center nav-link active']");
    By homePageloans = By.xpath("(//a[@class='d-flex align-items-center nav-link'])[1]");
    By homePageAboutus = By.xpath("//span[text()='About Us']");
    By homePageservices = By.xpath("//span[text()='Services']");
    By homePageblog = By.xpath("//span[text()='Blog']");
    By homePagecontact = By.xpath("//span[text()='Contact']");
    By register = By.id("account-menu");
    By loginregister =By.xpath("(//a[@class='dropdown-item'])[2]");
    By scrollElement = By.xpath("//*[text()='Learn More']");



    private WebElement GetHomeScrean(){
        return ldriver.findElement(homePage);
    }
    private WebElement GetHomeloans(){
        return ldriver.findElement(homePageloans);
    }
    private WebElement GetaHomeboutus(){
        return ldriver.findElement(homePageAboutus);
    }
    private WebElement GetHomePageservices(){
        return ldriver.findElement(homePageservices);
    }
    private WebElement GetHomePageblog(){
        return ldriver.findElement(homePageblog);
    }
    private WebElement GetHomePagecontact(){
        return ldriver.findElement(homePagecontact);
    }
    private WebElement getScroll(){
        return ldriver.findElement(scrollElement);
    }
    private WebElement getregister(){
        return ldriver.findElement(register);
    }
    private WebElement getLoginRegister(){
        return ldriver.findElement(loginregister);
    }



    public void clickHomeScreen(){
        GetHomeScrean().click();
    }
    public void clickHomeloans(){
        GetHomeloans().click();
    }
    public void clickHomeaboutus(){
        GetaHomeboutus().click();
    }

    public void clickHomeservices(){
        GetHomePageservices().click();
    }
    public void clickHomeblog(){
        GetHomePageblog().click();
    }
    public void clickHomecontact(){
        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(homePagecontact));
        GetHomePagecontact().click();
    }



    public void clickLearnMore(){//scroll tusunu bu asamada calistirdik ...
        JavascriptExecutor executor = (JavascriptExecutor) ldriver;
        executor.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})",getScroll());
        getScroll().click();
    }
    public void clickregister() {
        getregister().click();
    }
    public  void  clickLoginRegistor(){
        getLoginRegister().click();
    }





}
