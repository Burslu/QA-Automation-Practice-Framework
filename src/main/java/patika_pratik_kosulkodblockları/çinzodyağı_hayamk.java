package patika_pratik_kosulkodblockları;

import java.util.Scanner;

public class çinzodyağı_hayamk {
    public static void main(String[] args) {
        // yemin ederim bot sandım takvimmiş ya la .
        int birthday,takvim;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Dogum yilinizi giriniz:");
        birthday = scanner.nextInt();
        takvim = birthday%12;
        switch (takvim){
            case 0:
                System.out.println("Maymun burcusunuz"+birthday);
                break;
            case 1:
                System.out.println("Horoz burcusunuz"+birthday);
                break;
            case 2:
                System.out.println("Köpek burcusunuz"+birthday);
                break;
            case 3:
                System.out.println("Domuz burcusunuz"+birthday);
                break;
            case 4:
                System.out.println("Fare burcusunuz"+birthday);
                break;
            case 5:
                System.out.println("Öküz burcusunuz"+birthday);
                break;
            case 6:
                System.out.println("Kaplan burcusunuz"+birthday);
                break;
            case 7:
                System.out.println("Tavşan burcusunuz"+birthday);
                break;
            case 8:
                System.out.println("Ejderha burcusunuz"+birthday);
                break;
            case 9:
                System.out.println("Yılan burcusunuz"+birthday);
                break;
            case 10:
                System.out.println("At burcusunuz"+birthday);
                break;
            case 11:
                System.out.println("Koyun burcusunuz"+birthday);
                break;

        }


    }
}
