package assignment.recursion;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.print("Enter a Number : ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        System.out.println("Sum : " + sum(number));
    }

    private static int sum(int number) {
        if (number == 0) return 0;

        return (number % 10) + sum(number / 10);
    }
}
