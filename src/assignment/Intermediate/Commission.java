package assignment.Intermediate;

import java.util.Scanner;

public class Commission {
    //Calculate Commission Percentage
    public static void main(String[] args) {
        System.out.println("Calculate Commission Percentage");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Amount : ");
        int price = scanner.nextInt();
        double discount = price * 0.20f;
        System.out.println("Discount (20%) : " + discount);
    }
}