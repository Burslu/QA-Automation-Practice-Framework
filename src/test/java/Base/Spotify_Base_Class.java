package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class Spotify_Base_Class  {

   protected WebDriver driver ;
   protected static WebDriverWait wait;

   @BeforeMethod

    public void stupSptify(){

       WebDriverManager.chromedriver().setup();
       driver =new ChromeDriver();
       driver.get("https://open.spotify.com/");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       wait = new WebDriverWait(driver,Duration.ofSeconds(5));

   }

//   @AfterMethod
//    public void teardown(){
//       driver.quit();
//   }
}
