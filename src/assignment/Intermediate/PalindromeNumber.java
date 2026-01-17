package assignment.Intermediate;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("Palindrome Number");
        System.out.print("Enter a Number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int oldNumber = number;
        int digits = 0;
        while (number > 0) {
            digits = (digits * 10) + (number % 10);
            number /= 10;
        }

        System.out.println(oldNumber);
        System.out.println(digits);

        if (oldNumber == digits) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Number is not Palindrome");
        }

    }
}
