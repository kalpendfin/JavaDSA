package assignment.Intermediate;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Armstrong Number");
        System.out.print("Enter a Number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int oldNumber = number;
        int digit = 0;
        int sum = 0;
        while (number > 0) {
            digit = number % 10;
            sum += (digit * digit * digit);
            number /= 10;
        }

//        System.out.println(oldNumber);
//        System.out.println(sum);

        if (sum == oldNumber) {
            System.out.println("Number is Armstrong number");
        } else {
            System.out.println("Number is not Armstrong number");
        }
        scanner.close();
    }
}
