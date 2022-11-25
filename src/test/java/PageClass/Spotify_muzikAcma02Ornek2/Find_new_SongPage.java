package PageClass.Spotify_muzikAcma02Ornek2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Find_new_SongPage {

    private WebDriver ldriver;

    public Find_new_SongPage(WebDriver gdriver){
        ldriver=gdriver;

    }

    By  findNewSong = By.className("XiVwj5uoqqSFpS4cYOC6");




    private WebElement findNew (){

        return ldriver.findElement(findNewSong);
    }

    public void clickButton(){

        findNew().click();
    }
}
