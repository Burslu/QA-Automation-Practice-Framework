package PageClass.Spotify_muzikAcma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page_spotify {

    private WebDriver ldriver;
    public Home_Page_spotify(WebDriver gdriver){
        ldriver=gdriver;
    }
    By loginButton = By.xpath("//*[text()='Log in']");


    private WebElement getLoginButton(){

        return ldriver.findElement(loginButton);
    }

    public void clickLoginButton(){
        getLoginButton().click();
    }



}
