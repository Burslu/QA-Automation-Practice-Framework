package example;

import java.util.Scanner;

public class methods {

    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        greetUser(name);
    }
    public static void greetUser(String name){
        System.out.println("hi there ,"+name);

    }
}
