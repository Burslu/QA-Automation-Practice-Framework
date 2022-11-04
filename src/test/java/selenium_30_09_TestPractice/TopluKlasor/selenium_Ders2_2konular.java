package selenium_30_09.TopluKlasor;

import Base.BaseTest;
import PageClass.TrendyolDeneme01.TrendyolMainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class selenium_Ders2_2konular extends BaseTest {
    @Test
    public void Test(){

        driver.get("https://www.trendyol.com");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        TrendyolMainPage trendyol = new TrendyolMainPage(driver);
        trendyol.FindManId();
        trendyol.FindshoesButton();
        trendyol.ClikSporShoesButton();
       // trendyol.FindshoesButton();

    }


}
