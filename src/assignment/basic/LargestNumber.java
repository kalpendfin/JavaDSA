package assignment.basic;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int number;
        int max = Integer.MIN_VALUE;

        do {
            System.out.print("Enter Number (0 to exit) : ");
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();
            if (number > max)
                max = number;
        } while (number != 0);

        System.out.println("Largest Number of All Number : " + max);

    }
}