package PageClass.TrendyolDeneme01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TrendyolMainPage {


    private WebDriver ldriver;
    public TrendyolMainPage(WebDriver gdriver){ldriver=gdriver;}


    By txt_SearchButton = By.className("modal-close");
    By txt_SearchButtonSubstitle = By.xpath(("(//a[text()='Erkek'])[1]"));

    By txt_ClickSporShoes = By.xpath("(//a[@href='/erkek-spor-ayakkabi-x-g2-c109'])[1]");

    private WebElement getTxt_FindButton(){
        return ldriver.findElement(txt_SearchButton);
    }
    private WebElement getTxtClick_And_hold_Button(){
       return ldriver.findElement(txt_SearchButtonSubstitle);
   }
   private WebElement getClickShoesButton(){
        return ldriver.findElement(txt_ClickSporShoes);
   }
    public void FindManId(){
        Actions act = new Actions(ldriver);
        act.moveToElement(getTxt_FindButton()).build().perform();
        getTxt_FindButton().click();


    }
   public void FindshoesButton(){
       Actions act1 =new Actions(ldriver);
       act1.moveToElement(getTxtClick_And_hold_Button()).build().perform();
       act1.clickAndHold(getTxtClick_And_hold_Button()).build().perform();
    }
    public void ClikSporShoesButton(){
        getClickShoesButton().click();
    }





}
