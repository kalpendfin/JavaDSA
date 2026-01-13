package assignment.Intermediate;

import java.util.Scanner;

public class CalculateAverageMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculate Average Marks");
        System.out.print("Enter Subject 1 Marks : ");
        int subject1 = scanner.nextInt();
        System.out.print("Enter Subject 2 Marks : ");
        int subject2 = scanner.nextInt();
        System.out.print("Enter Subject 3 Marks : ");
        int subject3 = scanner.nextInt();

        System.out.println("Average Marks = " + (subject1 + subject2 + subject3) / 3);

    }
}