package assignment.basic;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        System.out.print("Enter First Number : ");
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        System.out.print("Enter Second Number : ");
        int second = scanner.nextInt();
        System.out.println("Sum = " + (first + second));
    }
}
