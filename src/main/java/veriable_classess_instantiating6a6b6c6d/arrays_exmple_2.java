package veriable_classess_instantiating6a6b6c6d;

import java.util.Scanner;

public class arrays_exmple_2 {
    private static int grades[];
    private static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("how many grades would u like enter ? ");
        grades =new int[scanner.nextInt()];

        getGrades();
        System.out.println("Average"+String.format("%.2f",calcutareAverage()));
        System.out.println("Highiest:"+getHighest());
        System.out.println("lowhiest:"+getlowhest());
    }
    public static void getGrades(){
        for (int i=0; i<grades.length;i++){
            System.out.println("Enter grade #"+(i+1));
            grades[i]=scanner.nextInt();
        }
    }

    public static int calculateSam(){
        int sum =0;
        for (int grade:grades){
            sum = sum + grade;
        }
        return sum;
    }
    public static double calcutareAverage(){
        return calculateSam()/ grades.length;
    }
    public static int  getHighest(){
        int highest =grades[0];
        for (int grade: grades){
            if(grade >highest){
              highest=grade;
            }
        }
        return highest;
    }
    public static int  getlowhest(){
        int lowhest =grades[0];
        for (int grade: grades){
            if(grade < lowhest){
                lowhest=grade;
            }
        }
        return lowhest;
    }

}
