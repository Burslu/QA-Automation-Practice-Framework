package Base.FullTreuTestInstagram;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class InstagramTestBasePage01 {
    protected WebDriver driver;
    @BeforeMethod
    public void stup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.amazon.com.tr/=c&hvdvcmFLOecjN3eF q=tr_TR");
        }

    //@AfterMethod
    //public void after(){
       // driver.quit();

   // }
}
