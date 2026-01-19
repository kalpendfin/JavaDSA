package assignment.recursion;

import java.util.Scanner;

public class DigitProducts {
    public static void main(String[] args) {
        System.out.print("Enter a Number : ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        System.out.println("Sum : " + product(number));
    }

    private static int product(int number) {
        if (number % 10 == number) return number;

        return (number % 10) * product(number / 10);
    }
}
