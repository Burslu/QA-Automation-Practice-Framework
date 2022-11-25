package TestNgDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

    // DDT -> Data Driven Testing


    @Test(dataProvider = "dataForTest01")
    public void test01(String name, String surname, int maas){
        System.out.println(name + " " + surname + " " + maas);

    }
    @DataProvider
    public Object[][] dataForTest01(){
        /*
         * [
         * ["Omer", "Karsli"],
         * ["Berkay", "Uslu"]
         * ]
         * */

        Object[][] myArr = new Object[][]{
                new Object[]{"Omer", "Karsli", 3000},
                new Object[]{"Berkay", "Uslu", 4000},

        };

        return myArr;


    }

}
