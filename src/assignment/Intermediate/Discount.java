package assignment.Intermediate;

import java.util.Scanner;

public class Discount {
    //Calculate Discount Of Product
    public static void main(String[] args) {
        System.out.println("Calculate Discount Of Product");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Product Price : ");
        int price = scanner.nextInt();
        double discount = price * 0.20f;
        System.out.println("Discount : " + discount);
        System.out.println("Final Price : " + (price - discount));
    }
}