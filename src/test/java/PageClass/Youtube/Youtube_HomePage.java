package PageClass.Youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Youtube_HomePage {
    private WebDriver ldriver;
    public Youtube_HomePage(WebDriver gdriver){ldriver=gdriver;}


    By txtButton   =By.xpath("//input[@id='search']");
    By btcContinue =By.id("search-icon-legacy");

    private WebElement getTxtSearch(){

        return ldriver.findElement(txtButton);
    }
    private WebElement getbtcCountinue(){

        return ldriver.findElement(btcContinue);
    }

    public void WriteSearchButton(String SearcWord){
        getTxtSearch().sendKeys(SearcWord);

    }
    public void clicksearcbutton(){
        getbtcCountinue().click();
    }


}


