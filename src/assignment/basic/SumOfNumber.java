package assignment.basic;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        int number;
        int sum = 0;

        do {
            System.out.print("Enter Number (0 to exit) : ");
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();
            sum = sum + number;
        } while (number != 0);

        System.out.println("Total of All Number : " + sum);
    }
}
