package assignment.Intermediate;

import java.util.Scanner;

public class CalculateDepreciationofValue {
    public static void main(String[] args) {
        System.out.println("Calculate Depreciation of Value");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Amount : ");
        int amount = scanner.nextInt();
        System.out.print("Enter Depreciation Rate (%): ");
        float rate = scanner.nextFloat();

        System.out.println("Depreciation Value : " + amount * (rate / 100));
    }
}