package PageClass.Spotify_muzikAcma02Ornek2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class open_Button {

    private WebDriver ldriver;


    public open_Button(WebDriver gdriver){
        ldriver=gdriver;
    }

    By playButton = By.xpath("//span[@class='ButtonInner-sc-14ud5tc-0 jYSKoa encore-bright-accent-set']");


    private WebElement Play(){
        return ldriver.findElement(playButton);
    }

    public void clickPlayButton(){
        Play().click();
    }
}

