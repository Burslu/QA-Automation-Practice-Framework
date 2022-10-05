package kodlama_i_o;

public class ders_1_giriş {


    //sumOfTheArray example

    public static void main(String[] args) {
        int[] num1 = {1, 32, 43, 11, 22};// 109
        int[] num2 = {1, 8, 3, 11, 7};//30
        int[] num3 = {4, 3, 33, 21, 62};//123

        System.out.println(ders_1_giriş(num1));
        System.out.println(ders_1_giriş(num2));
        System.out.println(ders_1_giriş(num3));

    }

    public static int ders_1_giriş(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;

    }
}