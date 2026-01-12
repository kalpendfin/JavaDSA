package assignment.basic;

import java.util.Scanner;

public class SubtractProductAndSum {
    //https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
    public static void main(String[] args) {
        System.out.print("Enter a Number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int product = 1;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            product = product * digit;
            sum = sum + digit;
            number = number / 10;
        }

        System.out.println("Result : " + (product - sum));
    }
}