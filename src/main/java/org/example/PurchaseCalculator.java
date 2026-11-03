package org.example;
import java.util.Scanner;
public class PurchaseCalculator {
    public static double calculateFinalAmount(double amount) {
        if (amount >= 1000) {
            double discount = amount * 0.10;
            return amount - discount;
        } else {
            return amount;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        double amount = sc.nextDouble();
        double finalAmount = calculateFinalAmount(amount);
        System.out.println("Final Purchase Amount: " + finalAmount);
        sc.close();
    }
}
