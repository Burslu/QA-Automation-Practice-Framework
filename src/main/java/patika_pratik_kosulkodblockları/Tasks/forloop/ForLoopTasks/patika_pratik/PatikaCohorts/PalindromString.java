package patika_pratik_kosulkodblockları.Tasks.forloop.ForLoopTasks.patika_pratik.PatikaCohorts;

import java.util.Scanner;

public class PalindromString {
    public static void main(String[] args) {
        System.out.println(isPalindrome("adsa"));
    }
    static String isPalindrome(String str){
        StringBuilder sb = new StringBuilder(str);
        return str.equals(sb.reverse().toString())? "Palindromdur":"Palindrom degildir.";

    }
}
