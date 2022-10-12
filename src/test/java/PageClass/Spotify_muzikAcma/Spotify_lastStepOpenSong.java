package PageClass.Spotify_muzikAcma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Spotify_lastStepOpenSong {
    private WebDriver ldriver;


    public Spotify_lastStepOpenSong(WebDriver gdriver){
        ldriver=gdriver;
    }

    By SongLink = By.xpath("//a[@href='/track/72dIN8F7D5ydB3auSqNi84']");
    By SongBut = By.xpath("//span[@class='ButtonInner-sc-14ud5tc-0 jYSKoa encore-bright-accent-set']");


    private WebElement getSong(){
        return ldriver.findElement(SongLink);
    }
    private WebElement SongPlaybutton(){
        return ldriver.findElement(SongBut);
    }


    public void sonClickButton(){
        getSong().click();
    }
    public void PlayButton(){
        SongPlaybutton().click();
    }

}
