package PageClass.Spotify_muzikAcma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class spotify_songOpenPage {

    private WebDriver ldriver;


    public spotify_songOpenPage(WebDriver gdriver){
        ldriver=gdriver;

    }

    By SongPage = By.xpath("//div[@class='_gB1lxCfXeR8_Wze5Cx9']");



    private WebElement SongOpen(){
    return ldriver.findElement(SongPage);
    }


    public void ClickSongButton(){
        SongOpen().click();
    }
}
