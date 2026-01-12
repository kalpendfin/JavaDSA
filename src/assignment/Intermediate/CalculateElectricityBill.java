package assignment.Intermediate;

import java.util.Scanner;

public class CalculateElectricityBill {
    public static void main(String[] args) {
        System.out.println("Electricity Bill");
        System.out.print("Enter Unit : ");
        Scanner scanner = new Scanner(System.in);
        int unit = scanner.nextInt();
        double bill = 5.5 * unit;
        System.out.println("Your bill : " + bill);
    }
}