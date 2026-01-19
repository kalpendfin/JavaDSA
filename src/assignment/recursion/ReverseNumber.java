package assignment.recursion;

import java.util.Scanner;

public class ReverseNumber {
    static int sum = 0;
    static int i = 1;

    public static void main(String[] args) {
        System.out.print("Enter a Number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Reverse Number : " + reverseNumber(number));

    }

    private static int reverseNumber(int number) {

        if (number % 10 == number) return number;
        int result = reverseNumber(number / 10);
//        System.out.println(result);
        sum = number % 10;
        sum = (int) (sum * Math.pow(10, i++)) + result;
        return sum;
    }
}
