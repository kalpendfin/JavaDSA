package assignment;

import java.util.Scanner;

public class FirstJava {
//    https://github.com/kalpendfin/DSA-Bootcamp-Java/blob/main/assignments/02-first-java.md
    /*
    Write Java programs for the following:
    Write a program to print whether a number is even or odd, also take input from the user.
    Take name as input and print a greeting message for that particular name.
    Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
    Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
    Take 2 numbers as input and print the largest number.
    Input currency in rupees and output in USD.
    To calculate Fibonacci Series up to n numbers.
    To find out whether the given String is Palindrome or not.
    To find Armstrong Number between two given number.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int answer;
        do {
            System.out.println("===================================");
            System.out.println("1. Even Odd Number");
            System.out.println("2. Greetings");
            System.out.println("3. Simple Interest");
            System.out.println("4. Calculator");
            System.out.println("5. Larger Number");
            System.out.println("6. Currency Conversion");
            System.out.println("7. Fibonacci Series");
            System.out.println("8. Palindrome String");
            System.out.println("9. Armstrong Number");
            System.out.println("0. Exit");
            System.out.println("===================================");
            System.out.print("Enter your choice :");
            answer = scanner.nextInt();

            switch (answer) {
                case 1 -> {
                    System.out.print("Enter a number : ");
                    int evenOdd = scanner.nextInt();
                    evenOddNumber(evenOdd);
                }
                case 2 -> {
                    System.out.print("Enter a Name:");
                    String name = scanner.next();
                    System.out.println(greetings(name));
                }
                case 3 -> {
                    System.out.print("Enter Principle Amount:");
                    int amount = scanner.nextInt();
                    System.out.print("Enter Number Of Years");
                    int year = scanner.nextInt();
                    System.out.print("Rate of Interest:");
                    float roi = scanner.nextFloat();
                    System.out.println("Simple Interest : " + findInterest(amount, year, roi));
                }
                case 4 -> {
                    System.out.print("Enter First Number");
                    int first = scanner.nextInt();
                    System.out.print("Enter second Number:");
                    int second = scanner.nextInt();
                    System.out.print("Enter operator (+, - , *, / : ");
                    String ch = scanner.next();
                    System.out.println(calculate(first, second, ch));
                }
                case 5 -> {
                    System.out.print("Enter First Number : ");
                    int first = scanner.nextInt();
                    System.out.print("Enter Second Number : ");
                    int second = scanner.nextInt();

                    if (first > second) {
                        System.out.println("First Number is Large");
                    } else if (first < second) {
                        System.out.println("Second Number is Large");
                    } else {
                        System.out.println("Both numbers are equal.");
                    }
                }
                case 6 -> {
                    System.out.print("Enter Inr");
                    int inr = scanner.nextInt();
                    double dollar = inr / 90f;
                    System.out.println(inr + " Rs = $" + dollar);
                }
                default -> System.out.println("Bye-Bye");
            }


        } while (answer != 0);
    }

    private static double calculate(int first, int second, String ch) {
        return switch (ch) {
            case "+" -> first + second;
            case "-" -> first - second;
            case "*" -> first * second;
            case "/" -> (double) first / second;
            default -> -1;
        };
    }

    private static void evenOddNumber(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else
            System.out.println(number + " is odd number");
    }

    private static String greetings(String name) {
        return "Hello " + name;
    }

    private static double findInterest(int amount, int year, float rateOfInterest) {
        return (amount * year * rateOfInterest) / 100;
    }
}
