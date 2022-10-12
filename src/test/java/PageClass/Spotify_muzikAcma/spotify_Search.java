package PageClass.Spotify_muzikAcma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class spotify_Search {
    private WebDriver ldriver;

    public spotify_Search(WebDriver gdriver){
        ldriver=gdriver;
    }

    By searchBut = By.xpath("(//li[@class='eNs6P3JYpf2LScgTDHc6 InvalidDropTarget'])[2]");

    By searchBut1 = By.xpath("//input[@class='Type__TypeElement-goli3j-0 cPwEdQ QO9loc33XC50mMRUCIvf']");


    private WebElement search(){

        return ldriver.findElement(searchBut);
    }
    private WebElement searchbutmain(){
         return ldriver.findElement(searchBut1);
    }




    public void ClickSearcButton(){
        search().click();
    }

    public void searchButton(String songName){
        searchbutmain().sendKeys(songName);
    }



    }

