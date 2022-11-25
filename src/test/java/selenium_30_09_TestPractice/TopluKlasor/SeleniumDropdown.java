package selenium_30_09_TestPractice.TopluKlasor;

import Base.BaseClassTestORnek02;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SeleniumDropdown extends BaseClassTestORnek02 {

    @Test
    public void dropdownTest() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement drpdwnEl = driver.findElement(By.id("dropdown"));
        Select drpdwn = new Select(drpdwnEl);
        Thread.sleep(3000);
        drpdwn.selectByValue("2");
        Thread.sleep(3000);
        drpdwn.selectByVisibleText("Option 1");
        drpdwn.selectByIndex(0);
        System.out.println(drpdwn.getOptions());
    }
}
