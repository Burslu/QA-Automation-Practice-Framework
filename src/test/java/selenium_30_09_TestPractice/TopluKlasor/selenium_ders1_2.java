package selenium_30_09.TopluKlasor;

import PageClass.Amazon.AmazonHomePage;
import PageClass.Amazon.LoginPage;
import PageClass.Youtube.Youtube_HomePage;
import PageClass.Youtube.Youtube_findLinkClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Scanner;

public class selenium_ders1_2 {
    @Test
    public void Testt() throws InterruptedException {
        //Chromedriver objesi olusturulur
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();


        //Driver konfigurasyonu yapilir

        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //Selenium testine baslanir

        //Siteye  gidildi
        driver.get("https://www.amazon.com.tr/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com.tr%2F%3F_encoding%3DUTF8%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=trflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");

        //email yazilacak alan locate edildi
        WebElement txt_email = driver.findElement(By.id("ap_email"));

        // mail bilgisi girilir
        txt_email.sendKeys("omerkrsli@gmail.com");

        WebElement BtnContinue = driver.findElement(By.xpath("//input[@id='continue']"));
        BtnContinue.click();
        Thread.sleep(2000);
        WebElement Txt_Pasw = driver.findElement(By.id("ap_password"));
        Txt_Pasw.sendKeys("Okarsli61");
        Thread.sleep(2000);
        WebElement Txt_click1 = driver.findElement(By.id("signInSubmit"));
        Txt_click1.click();
        Thread.sleep(2000);
        WebElement Btn_Orders = driver.findElement(By.id("nav-orders"));
        Btn_Orders.click();
        Thread.sleep(2000);
        WebElement btn_cargoTakip = driver.findElement(By.id("a-autoid-2-announce"));
        System.out.println("btn_cargoTakip.getText() = " + btn_cargoTakip.getText());

        btn_cargoTakip.click();



        /*

         * id
         * xpath
         * cssSelector
         * name

         * linkText
         * partialLinkText
         * className
         * */


    }


    @Test
    public void YanlisGirisTesti() throws InterruptedException {

        //Chromedriver objesi olusturulur
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();


        //Driver konfigurasyonu yapilir

        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.amazon.com.tr/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com.tr%2F%3F_encoding%3DUTF8%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=trflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");

        //email yazilacak alan locate edildi
        WebElement txt_email = driver.findElement(By.id("ap_email"));

        // mail bilgisi girilir
        txt_email.sendKeys("omerkrsli@gmail.com");

        WebElement BtnContinue = driver.findElement(By.xpath("//input[@id='continue']"));
        BtnContinue.click();
        Thread.sleep(2000);
        WebElement Txt_Pasw = driver.findElement(By.id("ap_password"));
        Txt_Pasw.sendKeys("abc");

        WebElement btn_login = driver.findElement(By.id("signInSubmit"));
        btn_login.click();

        WebElement alertBox = driver.findElement(By.id("auth-error-message-box"));

        String alertMessage = alertBox.getText();
        System.out.println("alertMessage = " + alertMessage);

        Assert.assertTrue(alertMessage.contains("Şifreniz yanlış"));


    }

    @Test
    public void instagramtesti() throws InterruptedException {

        //Chromedriver objesi olusturulur
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        //Driver konfigurasyonu yapilir
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.instagram.com");

        WebElement usernameInput = driver.findElement(By.xpath("//input[@name='username']"));
        usernameInput.sendKeys("testautomationwinseverytime");
        Thread.sleep(1500);
        WebElement passwordInput = driver.findElement(By.xpath("//input[@name='password']"));
        passwordInput.sendKeys("test1234567890");
        Thread.sleep(1500);
        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        submitButton.click();
        Thread.sleep(1500);
        WebElement serchbut = driver.findElement(By.xpath("//div[@role='button']"));
        serchbut.click();
        Thread.sleep(2000);
        WebElement sercinput = driver.findElement(By.xpath("//input[@placeholder='Search']"));
        sercinput.sendKeys("ibrahim Berkay uslu");
        Thread.sleep(1500);
        WebElement findmember = driver.findElement(By.xpath("//div[contains(text(),'brahim Berkay Uslu')]"));
        System.out.println("ibrahim Berkay uslu " + findmember.getText());
        findmember.click();
        WebElement buttonfollow = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
        buttonfollow.click();

         /*
         guzel kod yaz nazar degmesin.
         username: testautomationwinseverytime
         password: test1234567890
          *///*[@id="f1e2174e23e1f5c"]
        //Chromedriver objesi olusturulur


    }
    @Test
    public void Theinternettest() throws InterruptedException{
        //crome driver olusturuyoruz...
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        //driver konfirgurasyon yap
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.get("https://www.youtube.com");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        Thread.sleep(2500);
//        WebElement inputlogin = driver.findElement(By.linkText("Inputs"));
//        inputlogin.click();
//        Thread.sleep(2500);
//        WebElement numberstart = driver.findElement(By.xpath("//input[@type]"));
//        numberstart.sendKeys("2");
//        Thread.sleep(2500);
//        WebElement addremovebutton = driver.findElement(By.xpath("//a[text()='Add/Remove Elements']"));
//        addremovebutton.click();
//
//        WebElement addbutton = driver.findElement(By.xpath("//button[text()='Add Element']"));
//        addbutton.click();
//        Thread.sleep(2000);
//        WebElement buttonDelete = driver.findElement(By.xpath("//button[text()='Delete']"));
//        buttonDelete.click();
        WebElement youtubebutton = driver.findElement(By.xpath("//input[@id='search']"));
        youtubebutton.sendKeys("ahmet enes cennet");

//        WebElement searchbutton = driver.findElement(By.id("search-icon-legacy"));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("search-icon-legacy")));
        WebElement searchbutton = driver.findElement(By.id("search-icon-legacy"));
        searchbutton.click();

        WebElement linksong =driver.findElement(By.xpath("//a[@title='ahmet enes - Cennet']"));
        linksong.click();




    }
    @Test
    public void testWaituntil() throws InterruptedException{
        WebDriverManager.chromedriver().setup();

        WebDriver driver1 = new ChromeDriver();
        //driver konfirgurasyon yap

        driver1.manage().window().maximize();
        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver1.get("https://www.youtube.com/");
        WebDriverWait wait1 = new WebDriverWait(driver1, Duration.ofSeconds(5));
        Youtube_HomePage youtube = new Youtube_HomePage(driver1);
        youtube.WriteSearchButton("gel gonlumu yerden yere");
        youtube.clicksearcbutton();
        Youtube_findLinkClass linkClass = new Youtube_findLinkClass(driver1);
        linkClass.ClickLink();
        //wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='search']")));
        //WebElement searchbut = driver1.findElement(By.xpath("//input[@id='search']"));
        //searchbut.sendKeys("gel gonlumu yerden yere ");
        //searchbut.sendKeys(Keys.ENTER);

    }


@Test
    public  void  yenitest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver1 = new ChromeDriver();
        //driver konfirgurasyon yap
      //  driver1.getWindowHandles();
        driver1.manage().window().maximize();
        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver1.get("https://www.amazon.com/");

        Actions actions = new Actions(driver1);

        WebElement acountlist = driver1.findElement(By.id("nav-link-accountList"));
        actions.moveToElement(acountlist).build().perform();
        driver1.findElement(By.linkText("Account")).click();

    }


    @Test
    public void dragAndDropTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver1 = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver1,Duration.ofSeconds(8));
        //driver konfirgurasyon yap

        driver1.manage().window().maximize();
        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver1.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
        driver1.switchTo().frame(driver1.findElement(By.xpath("(//iframe)[4]")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@id='gallery']//li)[1]")));

        WebElement columnA = driver1.findElement(By.xpath("(//*[@id='gallery']//li)[1]"));
        WebElement columnB = driver1.findElement(By.id("trash"));
        Actions ACT= new Actions(driver1);

        ACT.dragAndDrop(columnA,columnB).build().perform();
    }
    @Test
        public void WebsiteLogin(){
        WebDriverManager.chromedriver().setup();
        WebDriver drivermain = new ChromeDriver();
        WebDriverWait waitMetod =new WebDriverWait(drivermain,Duration.ofSeconds(5));

        drivermain.manage().window().maximize();
        drivermain.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        drivermain.get("https://www.amazon.com.tr");
        AmazonHomePage hp = new AmazonHomePage(drivermain);
        hp.clickSignin();
        LoginPage lp = new LoginPage(drivermain);
        lp.writeEmailMetod("iberkayuslu41@gmail.com");
        lp.clickcontinue();
        lp.writePassword("123789465B");
        lp.clicksignButton();
        hp.searchKeys("gülen adam");
        hp.clickSSearchBButton();


        //WebElement clickpropagation = drivermain.findElement(By.id("//@id='nav-flyout-ya-signin'"));
        //clickpropagation.click();

//        ChromeDriver emirDriver = new ChromeDriver();
//
//        WebDriver elementdriver;
//
//        elementdriver = new ChromeDriver();
//        elementdriver = new FirefoxDriver(

//        );

    }

    @Test // ek sekme acarak islemleri devam ettirdik ...
    public void newWindowOpen(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver2 = new ChromeDriver();
        WebDriverWait wait1 = new WebDriverWait(driver2,Duration.ofSeconds(5));

        driver2.manage().window().maximize();
        driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver2.get("https://www.amazon.com.tr");
        Actions act = new Actions(driver2);
        driver2.switchTo().newWindow(WindowType.WINDOW);
        driver2.get("https://www.amazon.com.tr/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com.tr%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=trflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");


    }



}





