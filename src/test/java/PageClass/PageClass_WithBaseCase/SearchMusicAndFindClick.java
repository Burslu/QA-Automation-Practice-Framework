package PageClass.PageClass_WithBaseCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchMusicAndFindClick {

    private WebDriver ldriver;

    public SearchMusicAndFindClick(WebDriver gdriver){
        ldriver=gdriver;
    }


    By selectMusic= By.xpath("//*[text()='Daily Mix 4']");



    private WebElement getselectMusic(){
        return ldriver.findElement(selectMusic);
    }

    public void ClickMusicBox(){
        getselectMusic().click();
    }
}
