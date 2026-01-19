package assignment.recursion;

import java.util.Scanner;

public class ZeroCount {
    public static void main(String[] args) {
        System.out.print("Enter Number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int count = findZero(number);
        System.out.println("No of Zeros are : " + count);
    }

    private static int findZero(int number) {
        int count = 0;
        if (number % 10 == number) return count;
        int rem = number % 10;
        if (rem == 0) {
            count++;
        }
        return count + findZero(number / 10);
    }
}
