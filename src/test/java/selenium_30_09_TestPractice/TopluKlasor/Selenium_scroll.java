package selenium_30_09.TopluKlasor;

import Base.BaseClassTestORnek02;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Selenium_scroll extends BaseClassTestORnek02 {


   @Test
    public void test1() throws InterruptedException, IOException {
        driver.get("https://www.google.com");
       JavascriptExecutor executor = (JavascriptExecutor)driver;//java Script kodlarini kullanabilmek icin olusturdugumuz objemisti.
       driver.findElement(By.name("q")).sendKeys("Berkay uslu" + Keys.ENTER);
       WebElement element1 = driver.findElement(By.xpath("//*[text()='Ankara']"));
       executor.executeScript("arguments[0].scrollIntoView();", element1);
       Thread.sleep(1000);
       executor.executeScript("window.scrollBy(0,-250)");

       File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       FileUtils.copyFile(scrFile, new File("C:\\Users\\iberk\\Desktop\\homePageScreenshot.png"));
       /*
       Actions a = new Actions(driver);
//scroll down a page
a.sendKeys(Keys.PAGE_DOWN).build().perform();
//scroll up a page
a.sendKeys(Keys.PAGE_UP).build().perform();
        */






   }
}
