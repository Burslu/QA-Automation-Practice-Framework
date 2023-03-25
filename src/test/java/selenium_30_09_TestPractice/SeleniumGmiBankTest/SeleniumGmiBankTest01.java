package selenium_30_09_TestPractice.SeleniumGmiBankTest;

import Base.GmibankBaseClass;
import PageClass.Amazon.Gmibank.RegisterPage;
import PageClass.Amazon.PageClass_GmibankTest.HomePageGmibank;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumGmiBankTest01 extends GmibankBaseClass {

    @Test
    public void navBarHomeTest() {
        HomePageGmibank homePage = new HomePageGmibank(driver);
        homePage.clickHomeScreen();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.gmibank.com/");


    }

    @Test
    public void navBarLoansTest() {
        HomePageGmibank homePage = new HomePageGmibank(driver);
        homePage.clickHomeloans();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.gmibank.com/loan");


    }

    @Test
    public void navBarAboutUsTest() {
        HomePageGmibank homePage = new HomePageGmibank(driver);
        homePage.clickHomeaboutus();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.gmibank.com/about");

    }

    @Test
    public void navBarservicesTest() {
        HomePageGmibank homePage = new HomePageGmibank(driver);
        homePage.clickHomeservices();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.gmibank.com/services");


    }

    @Test
    public void navBarblogTest() {
        HomePageGmibank homePage = new HomePageGmibank(driver);
        homePage.clickHomeblog();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.gmibank.com/blog");


    }

    @Test
    public void navBarcontactTest() {
        HomePageGmibank homePage = new HomePageGmibank(driver);
        homePage.clickHomecontact();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.gmibank.com/contact");


    }



        @Test
        public void navBarScrollTest(){
            HomePageGmibank homePage = new HomePageGmibank(driver);
            homePage.clickLearnMore();



    }

        @Test
        public void navBarregisterTest() {
            HomePageGmibank homePage = new HomePageGmibank(driver);
            homePage.clickregister();
            Assert.assertEquals(driver.getCurrentUrl(), "https://www.gmibank.com/");
            homePage.clickLoginRegistor();
            RegisterPage registerPage = new RegisterPage(driver);
            registerPage.clickAndSendkeysssnButton("2256512");
            registerPage.verifyErorMassage();
            registerPage.sendFirstName("berkay uslu");
//            Assert.assertTrue(true);
//            registerPage.sendFirstName();



//            registerPage.VerifyErorFirtName();
//            Assert.assertTrue(true);
        }


}