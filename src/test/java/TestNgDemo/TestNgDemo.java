package TestNgDemo;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNgDemo {
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class calıştı");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("after Class calıştı");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method calıştı");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("after method calıştı");
    }
    @Test
    public void birinciTest(){

        int a = 15, b = 25;

        Assert.assertEquals(sayilariTopla(a,b), 40, "Sayılar birbirine eşit değil");

        System.out.println("method 1 çalıştı");



    }

    @Test
    public void ikiniciTest(){

        int a = 15, b = 25;

        Assert.assertEquals(sayilariTopla(a,b), 40, "Sayılar birbirine eşit değil");


        System.out.println("method 2 çalıştı");


    }



    public int sayilariTopla(int a, int b){

        return a-b;
    }
}
