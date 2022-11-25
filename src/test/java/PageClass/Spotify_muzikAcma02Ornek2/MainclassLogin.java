package PageClass.Spotify_muzikAcma02Ornek2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainclassLogin{
        private WebDriver ldriver;
        public MainclassLogin(WebDriver gdriver){
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

