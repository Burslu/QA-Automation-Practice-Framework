package selenium_30_09.FullTestInstagram;

import Base.FullTreuTestInstagram.AmazonLoginPage;
import Base.FullTreuTestInstagram.HomePageamazonTest;
import Base.FullTreuTestInstagram.AmazonTestBasePage01;
import org.testng.annotations.Test;

public class SelenuimInstagramRunner extends AmazonTestBasePage01 {

    @Test // correct login page test
    public void loginPageUserNamePasswordTest(){
        HomePageamazonTest AmazonTest = new HomePageamazonTest(driver);
        AmazonTest.AmazonMainPage();
        AmazonLoginPage loginPage = new AmazonLoginPage(driver);
        loginPage.sendUserName("iberkayuslu41@gmail.com");
        loginPage.clickCountinueBut();
        loginPage.verifySigninPageOpened();
    }
    @Test // Wrong login page test
    public void wrongloginPageUserNamePasswordTest(){
        HomePageamazonTest AmazonTest = new HomePageamazonTest(driver);
        AmazonTest.AmazonMainPage02();
        AmazonLoginPage loginPage = new AmazonLoginPage(driver);
        loginPage.sendUserName("iberkayuslu41@hotmail.com");
        loginPage.clickWrongBut();
    }

}
