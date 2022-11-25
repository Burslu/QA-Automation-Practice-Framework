package Base.FullTreuTestInstagram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class HomePageamazonTest {

    private WebDriver ldriver;




    public HomePageamazonTest(WebDriver gdriver){
        ldriver=gdriver;
    }
    By loginForAcount = By.xpath("(//*[@class='nav-line-1-container'])");
    By continueButTest = By.id("continue");

    private WebElement getloginForm(){
        return ldriver.findElement(loginForAcount);
    }
    private WebElement getcontinue(){
        return ldriver.findElement(continueButTest);
    }




    public void AmazonMainPage() {
        AmazonMainPage02();
        Assert.assertTrue(getcontinue().getAttribute("id").contains("continue"));
    }
    public void AmazonMainPage02() {
        Actions action = new Actions(ldriver);
        action.moveToElement(getloginForm()).click().build().perform();

    }










}
