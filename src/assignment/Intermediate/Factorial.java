package assignment.Intermediate;

import java.util.Scanner;

public class Factorial {
    //Factorial Program In Java
    public static void main(String[] args) {
        System.out.print("Enter a Number : ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int fact = 1;

        while (number > 0) {
            fact = fact * number;
            number--;
        }

        System.out.println("Factorial : " + fact);
    }
}
