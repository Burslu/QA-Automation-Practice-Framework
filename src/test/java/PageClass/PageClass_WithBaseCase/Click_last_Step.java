package PageClass.Spotify_muzikAcma02Ornek2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Click_last_Step {

    private WebDriver ldriver;


    public Click_last_Step(WebDriver gdriver){
        ldriver=gdriver;

    }

    By ClickButoid = By.xpath("//span[@class='ButtonInner-sc-14ud5tc-0 jYSKoa encore-bright-accent-set']");

    private WebElement  getClickBut(){
        return ldriver.findElement(ClickButoid);
    }

    public void Click(){
        getClickBut().click();
    }
}
