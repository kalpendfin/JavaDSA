package assignment.recursion;

import java.util.Scanner;

public class RecursionFactorial {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int result = factorial(number);
        System.out.println("Result : " + result);
    }

    private static int factorial(int number) {
        if (number == 1) return 1;

        return number * factorial(number - 1);
    }
}