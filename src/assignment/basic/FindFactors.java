package assignment.basic;

import java.util.Scanner;

public class FindFactors {
    public static void main(String[] args) {
        System.out.print("Enter A Number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i = 1;
        while (i <= number) {
            if (number % i == 0) {
                System.out.println(number + " is divisible by " + i);
            }
            i = i + 1;
        }
    }
}