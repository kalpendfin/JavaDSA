package assignment.Intermediate;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        System.out.println("Average Calculation");
        Scanner scanner = new Scanner(System.in);

        int number;
        int count = 0;
        int sum = 0;
        do {
            System.out.print("Enter a number (0 to exit) ");
            number = scanner.nextInt();
            sum += number;
            if (number != 0) count++;
        } while (number != 0);

        double avg = (double) sum / count;

        System.out.println("Sum : " + sum);
        System.out.println("Count : " + count);
        System.out.println("Average : " + avg);
    }
}
