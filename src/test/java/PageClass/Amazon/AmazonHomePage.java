package PageClass.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AmazonHomePage {

    private WebDriver ldriver;//localDriver

    public AmazonHomePage(WebDriver gdriver){
        ldriver = gdriver;
    }//globalDriver

//Locatorlar burada bulunuyor
    By searchTextBoxLocator = By.id("twotabsearchtextbox");
    By AccNListsButton = By.id("nav-link-accountList");
    By signinButton = By.xpath("(//div[@id='nav-flyout-ya-signin']//a)[1]");
    By searchButton =By.id("nav-search-submit-button");

    // Element bulma teknigi
    private WebElement getSearchTextBox(){

        return ldriver.findElement(searchTextBoxLocator);
    }

    private WebElement getAccountsAndListButton(){

        return ldriver.findElement(AccNListsButton);
    }
    private WebElement getsigninButton(){

        return ldriver.findElement(signinButton);
    }
    private WebElement getSearchbutton(){

        return ldriver.findElement(searchButton);
    }
    public void searchKeys(String keys){

        getSearchTextBox().sendKeys(keys);
    }
    public void clickSignin() {
        Actions act = new Actions(ldriver);
        act.moveToElement(getAccountsAndListButton()).build().perform();
        getsigninButton().click();
    }
    public void clickSSearchBButton(){
        getSearchbutton().click();
    }






}
