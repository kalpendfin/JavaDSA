package assignment.Intermediate;

import java.util.Scanner;

public class Power {
    //Power In Java
    public static void main(String[] args) {
        System.out.println("Power In Java");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = scanner.nextInt();
        System.out.print("Enter Power : ");
        int power = scanner.nextInt();
        System.out.println(number + " to power " + power + " is " + Math.pow(number, power));

    }
}