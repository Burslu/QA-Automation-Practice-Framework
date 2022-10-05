package veriable_classess_instantiating6a6b6c6d;

import java.util.Scanner;

public class varible_scope_örnek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cost of the plan");
        double baseCost = scanner.nextInt();
        System.out.println("Enter overage minutes");
        double overageMinutes = scanner.nextInt();
        scanner.close();
        double overCharge = calculateOverages(overageMinutes);
        double tax = calcculateTax(baseCost + baseCost);
        calculateAndPrintBill(baseCost, overCharge, tax);
    }

    public static double calculateOverages(double extraMinutes) {
        double rate = 0.25;
        double overage = extraMinutes * rate;
        return overage;
    }

    public static double calcculateTax(double subtotal) {
        double rate = 0.15;
        double tax = subtotal * rate;
        return tax;
    }
    public static double calculateAndPrintBill(double base, double overage, double tax){
        double finaltotal = base + overage + tax;
        System.out.println("phone bill statment :");
        System.out.println("plan: $ :" + String.format("%.2f", base));
        System.out.println("overage $ :" + String.format("%.2f", overage));
        System.out.println("tax :" + String.format("%.2f", tax));
        System.out.println("final total :" + String.format("%.2f", finaltotal));
        return finaltotal;
    }
}
