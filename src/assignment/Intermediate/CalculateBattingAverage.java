package assignment.Intermediate;

import java.util.Scanner;

public class CalculateBattingAverage {
    public static void main(String[] args) {
        System.out.println("Calculate Batting Average");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number of Hits : ");
        int hits = scanner.nextInt();
        System.out.print("Enter the Number At Bats : ");
        int atBats = scanner.nextInt();

        double battingAverage = hits / atBats;

        System.out.println("Batting Average : " + battingAverage);

        scanner.close();
    }
}