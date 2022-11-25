package patika_pratik_kosulkodblockları.Tasks.forloop.ForLoopTasks.patika_pratik;

import java.util.Arrays;

public class frekans_bulma {
    public static void main(String[] args) {

        int[] list1 = {10, 20, 20, 10, 10, 5, 20};
        Arrays.sort(list1);
        int n;
        for (int i=1; i<list1.length; i++){
            n=1;
            for (int j=1; j<list1.length; j++){
                if (i!=j && list1[i]==list1[j]){
                    n++;
                }
            }
            if (i==list1.length-1|| list1[i]!=list1[i+1]){
                System.out.println(list1[i]+".Eleman"+n+"kere tekrar edildi.");
            }
        }


    }
}
