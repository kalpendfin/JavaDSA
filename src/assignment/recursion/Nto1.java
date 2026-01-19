package assignment.recursion;

import java.util.Scanner;

public class Nto1 {
    public static void main(String[] args) {
        System.out.print("Enter a Number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

//        backWard(number);
//        forward(number);
        both(number);
    }

    private static void both(int number) {
        if (number == 0) return;
        System.out.println(number);
        both(number - 1);
        System.out.println(number);
    }

    private static void forward(int number) {
        if (number == 0) return;
        forward(number - 1);
        System.out.println(number);
    }

    private static void backWard(int number) {
        if (number == 0) return;
        System.out.println(number);
        backWard(number - 1);
    }


}
