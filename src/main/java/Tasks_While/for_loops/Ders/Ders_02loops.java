package Tasks_While.for_loops.Ders;

import java.util.Scanner;

public class Ders_02loops {
    public static void main(String[] args) {

        //girilen ifadenin polindorm olmasini kontrol eden metodu creat edin
        //polindrom = her iki yonde esit oldugunu ifade eder
        //ornek;
        // ey edip adanada pide ye
        Scanner sc = new Scanner(System.in);
        System.out.println("bir cumle yaziniz");
        String str=sc.nextLine();
        polindrom(str);// string parametreli metod 
    }//main disi burasi


    private static void polindrom(String str) {

  String tersStr = " ";
  for (int i =str.length()-1;i>=0;i--){
      tersStr+=str.charAt(i);//str nin i inci karakterini ters str ye ekler (concat) .

  }
        System.out.println("girilen ifadenin tersi"+tersStr);
  if (str.equalsIgnoreCase(tersStr)){
      System.out.println("girilen ifade polindromdur");
  }else {
      System.out.println("girilen ifade polindrom degildir");
  }
    }


}
