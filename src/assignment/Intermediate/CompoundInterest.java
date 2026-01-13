package assignment.Intermediate;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Compound Interest");
        System.out.print("Enter Principle Amount : ");
        int amount = scanner.nextInt();
        System.out.print("Enter Rate of Interest : ");
        float rate = scanner.nextFloat();
        System.out.print("Enter Time Period (in years) : ");
        int years = scanner.nextInt();

        double ci = amount * (Math.pow((1 + (rate / 100)), years)) - amount;
        System.out.println("Compound Interest : " + ci);
    }
}
