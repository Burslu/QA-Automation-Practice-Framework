package patika_pratik_kosulkodblockları;

public class bir_yüz_arasiasalsayilar {
    public static void main(String[] args) {

        int sayi, i, control;
        for (i = 2; i < 100; i++) {
            control = 0;
            for (sayi = 2; sayi < i; sayi++) {
                if(i%sayi==0){
                    control=1;
                    break;
                }
            }
            if (control==0){
                System.out.print(i+" ");
            }
        }

    }
    }

