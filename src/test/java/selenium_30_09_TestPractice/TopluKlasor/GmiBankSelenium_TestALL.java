package selenium_30_09_TestPractice.TopluKlasor;

import Base.GmibankBaseClass;
import PageClass.Amazon.GmiBankTestCase.TestClass;
import PageClass.Amazon.GmiBankTestCase.TestClass02;
import org.testng.annotations.Test;

public class GmiBankSelenium_TestALL extends GmibankBaseClass {
    @Test

    public void RegisterSSNTest(){
        TestClass TestSsnBut = new TestClass(driver);
        TestSsnBut.sendCorrectSSN("123-45-6789");
    }
    @Test
    public void RegistrVerifyErorTest(){
        TestClass TestSsnBut = new TestClass(driver);
        TestSsnBut.sendWrongSSN("999-66-3456");
    }
    @Test
    public void RegisteerFirstNameTest(){
        TestClass TestSsnBut = new TestClass(driver);
        TestSsnBut.sendCorrectFirstName("berkay");
    }
    @Test
    public void RegisteerFirstNameErorTest() {
        TestClass TestSsnBut = new TestClass(driver);
        TestSsnBut.sendWrongFirstName(" ");
    }
    @Test
    public void RegisterLastNameCorrectTest(){
        TestClass TestSsnBut = new TestClass(driver);
        TestSsnBut.sendlastNameCorrect("uslu");
    }
    @Test
    public void RegisterLastNameWrongTest() throws InterruptedException {
        TestClass TestSsnBut = new TestClass(driver);
        TestSsnBut.sendlastNameWrong("  ");
    }
    @Test
    public void CorrctAdress() throws InterruptedException {
        TestClass TestSsnBut = new TestClass(driver);
        TestSsnBut.clickAndMoreAdress("adres");
    }
    @Test
    public  void WrongTest(){
        TestClass TestSsnBut = new TestClass(driver);
        TestSsnBut.wrongAdress(" ");
    }
    @Test
    public void correctPhoneNumber(){
        TestClass TestSsnBut = new TestClass(driver);
        TestSsnBut.corrctPhoneNumber("151-515-1561");
    }
    @Test
    public void wrongPhoneNumber(){
        TestClass TestSsnBut = new TestClass(driver);
        TestSsnBut.wrongNumber("151-515-156");
    }
//    @Test
//    public void passwordWrongTes0(){
//        TestClass TestSsnBut = new TestClass(driver);
//        TestSsnBut.wrongPassword("ADMIN2021!");
//    }
    @Test
    public void wrongPasswordTest(){
        TestClass02 testclas02 = new TestClass02(driver);
        testclas02.wrongPassw("ADMIN2021!");
    }
    @Test
    public void correctPasswordTest(){
        TestClass02 testclas02 = new TestClass02(driver);
        testclas02.correctPassw("aDMIN123!");
    }
    @Test
    public void mailCorrect(){
        TestClass02 testClass02 = new TestClass02(driver);
        testClass02.sendCorrctMail("berkayuslu@hotmail.com");
    }
    @Test
    public void mailWrong(){
        TestClass02 testClass02 = new TestClass02(driver);
        testClass02.sendWrongMail("berkayuslu@hotmail.com");
    }  @Test
    public void secondPasswordwrong(){
        TestClass02 testClass02 = new TestClass02(driver);
        testClass02.controlCorrectSecondPassword("berkayuslu@hotmail.com");
    }@Test
    public void secondPasswordCorrect(){
        TestClass02 testClass02 = new TestClass02(driver);
        testClass02.controlCorrectSecondPassword("aDMIN123!");
    }



}
