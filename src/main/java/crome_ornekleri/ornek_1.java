package crome_ornekleri;

import java.util.Scanner;



public class ornek_1 {
    public static void main(String[] args) {

////        1 adim ;60 degerinde bir integer olusturun
//
//        int myInt = 60;
//
//
//        //2 adim ;eger int 9 a bolumunden kalan 0 ise ve 5 e bolumunden kalan 0 ise
//        // sayiya `able to divide by 9 and 5 yazdirin
//
////        myInt % 9 ==0;
////        myInt % 5 ==0;
//
//        if(( myInt % 9 == 0) && (myInt % 5 == 0)){
//            System.out.println("able to divide by 9 and 5");
//
//
//        }
//        //3 adim ;eger int 4 a bolumunden kalan 0 ise ve 15 e bolumunden kalan 0 ise
//        // sayiya `able to divide by 9 and 5 yazdirin
//        if(( myInt % 4 == 0) && (myInt % 15 == 0)){
//            System.out.println("able to divide by 9 and 5");
//
//
//        }

        // kullanicinin girdigi rakami yazi ile print eden program...


        //bakiye 1000 tl ve  para cekme yatirma giris cikis islemleri

//        Scanner scan =new Scanner(System.in);
//        System.out.println("   ");
//        System.out.println(" Bankamiza hosgeldiniz");
//        System.out.println(" Bakiye sorgulama -1\n Para cekme -2\n Para yatirma -3\n cikis-4");
//        int secim=scan.nextInt();
//        int bakiye=1000;
//        //bakiye ogrenme;2
//
//
//        switch (secim) {
//            case 1:
//            System.out.println("bakiyen" +bakiye);
//            break;
//
//
//            //para cekme;
//            case 2:
//            System.out.println("Para cekme cekilecek tutari giriniz");
//            int paracekme= scan.nextInt();
//            if(paracekme>bakiye) {
//                System.out.println("yeteri kadar paraniz yok ");
//
//            }else{
//                bakiye -=paracekme;
//                System.out.println("guncel bakiye;"+bakiye);
//
//            }
//            break;
//
//            //para yatirma;
//            case 3:
//            System.out.println("Ne kadar yatiracaksiniz;");
//            int yatirilanpara = scan.nextInt();
//            bakiye += yatirilanpara;
//            System.out.println("bakiyenizin son hali;\n" + bakiye);
//            break;
//            //cikis yapma;
//            case 4:
//            System.out.println("cikis yapildi");
//            break;
//
//            default:
//                System.out.println("hatali giris yaptiniz");
//        }


        // girilen e-mail hesabi  @gmail hesabi icermiyorsa lutfen @gmail giriniz yazdir...
//        Scanner scan = new Scanner(System.in);
//        String nu1="email";
//        if (nu1.contains(nu1)) {
//            System.out.println("email sozcugu icerir");
//        }else {
//            System.out.println("email icermiyor duzenleyin");
//        }


        // @gmail ile bitiyorsa isleminiz oynaylandi bitmiyorsa gecerli bir adres giriniz yazdiriniz...
//        Scanner scan = new Scanner(System.in);
//        System.out.println("bir e-mail adresi giriniz;");
//        String sorgu = scan.nextLine();
//
//
//      if (sorgu.endsWith("@gmail")){
//          System.out.println("mail adresiniz dogru ve @gmail ile bitiyor onaylandi");
//      }else {
//          System.out.println("gecerli bir adres giriniz...");
//      }


//
//
//        String str ="java bilen adam tamam simdi";
//        System.out.println(str.substring(10));//
//        //son 10 karakter yazdir
//        System.out.println(str.substring(str.length()-10));
//        //ilk 10 kaakter
//        System.out.println(str.substring(0,10));
//        girilen 4 kelimeyi tersten yazdirma;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("dort harfli kelime giriniz");
//        String kelime = scan.next();
//
//        if (kelime.length()!=4) {
//            System.out.println("uygun kiriterde bir kelime degil");
//
//        }else{
//            System.out.println(kelime.substring(kelime.length()-1));//1.harf
//            System.out.println(kelime.substring(2,3));
//            System.out.println(kelime.substring(1,2));
//            System.out.println(kelime.substring(0,1));
//
//        }
//        String ahmet="ahmet ferda";
//        String ahmet2 = "agmett";
//        System.out.println("ahmet.length() = " + ahmet.length());
//        System.out.println(ahmet.contains("a"));
//        System.out.println(ahmet.substring(0, 6));
//        System.out.println(ahmet.endsWith("a"));
//        System.out.println(ahmet.toLowerCase());
//        System.out.println(ahmet.toUpperCase());
//        System.out.println(ahmet.charAt(3));
//        System.out.println(ahmet.equals(ahmet2));
//        System.out.println(ahmet.indexOf("a"));
//        System.out.println(ahmet.lastIndexOf("a"));
//        System.out.println(ahmet.replace("a", "@"));

//        Scanner scan = new Scanner(System.in);
//        System.out.println("bir kelime giriniz");
//        String kelime = scan.next();
//
//        if (kelime.length()>=3){
//            System.out.println(kelime.substring(kelime.length() - 2 ).repeat(3));
//
//
//        }else{
//            System.out.println(kelime);
//
//        }
//


        //kullanicidan iusim ve soy isim girmesini isteyiniz konsola tam ismini buyuk isim ile yazdirin
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("ismini ve soy ismini giriniz;");
//        String FirstName =scan.next(), LastName = scan.next();
//
//        String FullName = (FirstName+LastName).toUpperCase();
//        System.out.println("Full name\n"+" "+ FullName);


        // kullanicidan 4 kelime isteyin ve sonuna . koyun

//        Scanner scan   = new Scanner(System.in);
//        System.out.println("ilk kelimeyi giriniz ");
//        String firstk  = scan.next() ;
//        System.out.println("ikinci kelimeyi giriniz ");
//        String secondk = scan.next();
//        System.out.println("ucuncu kelimeyi giriniz ");
//        String thirdk  = scan.next();
//        System.out.println("dorduncu kelimeyi giriniz ");
//        String forthk  = scan.next();
//
//        System.out.println(firstk.substring(0,1).toUpperCase() + firstk.substring(1) + " " +secondk + " " +thirdk+ " " + forthk+".");


        // ornek 3 cozum
//        String s= "   java ogrenmek123 cok guzel@  ";
//        s = s.replaceAll("\\d","");//123 atildi
//        s = s.replace("@","")//@ isarti atildi
//                .replace("C","c")//c kucultildi
//                .trim();//bosluklari aldik .
//        System.out.println(s);

//        ornek 1 .cozum
//        Scanner scan = new Scanner(System.in);
//        String name1 = scan.next();
//        String name2 = scan.next();
//
//        if (name1.length()%2==0){
//            System.out.println(name1.substring(0,name1.length()/2)+name2+name1.substring(name1.length()/2));
//        }else{
//            System.out.println("basaaramadik");
//        }
//
//        //ornek 2 cozum;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("bir kelime giriniz ");
//        String car = scan.next();
//        if (car.length()>=3 && car.length()%2!=0 ){
//            System.out.println(car.charAt(car.length()/2));
//
//        }else
//        {
//            System.out.println("asda");
//        }
//            // ornek 4 cozum;
//                Scanner scan = new Scanner(System.in);
//                System.out.println("bir kelime giriniz ");
//                String car = scan.next();
//                System.out.println("ikinci kelimeyi giriniz ");
//                String car1 = scan.next();
//
//                if (car.length()>car1.length()) {
//                    System.out.println("isminiz daha uzun amk ");
//                }else if (car.length()<car1.length()){
//                    System.out.println("soyisminiz daha uzun ");
//                }else {
//                    System.out.println("ikisi esit ");
//                }

// ornek  5 cozum ;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("bir kelime giriniz ");
//        String car= scan.nextLine();
//       // System.out.println(car);
//
//            if (car.contains(" ")) {
//                System.out.println("kelime bosluk iceriyor");
//            }else{
//                System.out.println("icermiyor");
//            }

        // ornek 6 cozum;

//        Scanner sc = new Scanner(System.in);
//        System.out.println("4 harfli bir kelime giriniz");
//            String kelime4Harfli = sc.next();
//            if (kelime4Harfli.length()==4) {
//                for (int i=kelime4Harfli.length()-1; i>=0;i--){
//                    System.out.print(kelime4Harfli.charAt(i));
//                }
//
//                for (int i=0; i<kelime4Harfli.length();i++){
//                    System.out.print(kelime4Harfli.charAt(kelime4Harfli.length()-1-i));
//                }
//            }else{
//                System.out.println("kelimeniz 4 harfli degil lutfen dogru bir kelime seciniz;");
////            }
////
//            String asd = new String("emir");
//            asd = new String("ömer");
//            String asdf = "emir";
//            ornekk_2 emir = new ornekk_2();
//    }


//        //ornek omer beyinki...indirim falan filan
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("aldiginiz urunun fiyatini giriniz ");
//        double urunfiyati = sc.nextDouble();
//
//        System.out.println("aldiginiz urunun adetini giriniz ");
//        int    urunadeti = sc.nextInt();
//
//        System.out.println("musteri kartiniz var mi  varsa v yoksa y yaziniz;");
//        char musterikartivarmi=sc.next().toUpperCase().charAt(0);
//
//
//        if (musterikartivarmi=='V'){
//            System.out.println();
//            //urun adeti kontrolu
//            if (urunadeti>=10)
//            {
//                System.out.println("%20 indirim kazandiniz"+(urunadeti*urunfiyati)*0.8);
//            }else{
//                System.out.println("%15 indirim kazandiniz"+(urunadeti*urunadeti)*0.85);
//
//            }
//        }else{
//            if (urunadeti>=10){
//                System.out.println("%15 indirim kazandiniz"+(urunadeti*urunadeti)*0.85);
//
//            }else{
//                System.out.println("%15 indirim kazandiniz"+(urunadeti*urunadeti)*0.90);


        // METODLAR..............................METODLAR
//        Scanner scan = new Scanner(System.in);
//        System.out.println("bir sayi giriniz"); int sayi = scan.nextInt();
//        System.out.println(isEven(sayi));
//    }
//
//    private static boolean isEven(int sayi) {
//     return  sayi % 2 == 0 ? true :false;

//    }
        //VERILEN BIR SAYIYYI METRE VE KM YE CEVIREN PROGRAM

//        Scanner sc = new Scanner(System.in);
//        System.out.println("bir sayi giriniz");
//        double sayi1 = sc.nextDouble();
//        System.out.println(meter(sayi1));
//        System.out.println(km(sayi1));
//        sayi(sayi1);
//
//
//    public static double meter(double x) {
//        return x / 100;
//    }
//
//    public static double km(double y) {
//        return y / 10000;
//    }
//
//    public static double sayi(double sayi) {
//        System.out.println("girilen cm degeri" + sayi / 100 + "metre" + sayi / 10000 + "km");
//    }
//        Scanner scan = new Scanner(System.in);
//        System.out.println("bir tam sayi giriniz;");
//        int sayi = scan.nextInt();
//        pozitifNegatif(sayi);
//        int i = sayi >= 100 ? (buyuk()) : (kucuk()););
//    }
//
//
//
//
//    private static void pozitifNegatif(int sayi) {
//
//        System.out.println(sayi >0 && sayi!=0 ?"pozitiftir":"Negatif");
//    }
//}
//
//    private static int kucuk() {
//    }
//
//    private static int buyuk() {

        //girilin ad soyadi ilk harfleri buyuk kalan harfleri kucuk yapan method create ediniz ...

        Scanner scanner = new Scanner(System.in);

        System.out.println("isminizi giriniz;");
        String isim    = scanner.nextLine();
        System.out.println("soy isminizi giriniz;");
        String soyIsim = scanner.nextLine();

        isimsoyIsimyazdir("isimDeneme","SoyIsimDeneme");
        isimsoyIsimyazdir(isim,soyIsim);

           }//main metod kapanma kismi

    private static void isimsoyIsimyazdir(String ad, String soyIsim) {

        System.out.println(ad = ad.substring(0, 1).toUpperCase() + ad.substring(1).toLowerCase());
        System.out.println(soyIsim = soyIsim.substring(0, 1).toUpperCase() + soyIsim.substring(1).toLowerCase());
    }


}












