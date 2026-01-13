package assignment.Intermediate;

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        System.out.println("Sum Of N Numbers");
        int number;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter Number (0 to exit ) : ");
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println("Sum of N Numbers : " + sum);
    }
}
