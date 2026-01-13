package assignment.Intermediate;

import java.util.Scanner;

public class CalculateCGPA {
    public static void main(String[] args) {
        System.out.println("Calculate CGPA");
        System.out.print("Enter Total Marks : ");
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        System.out.print("Enter No of Subjects : ");
        int subject = scanner.nextInt();

        System.out.println("CGPA = " + (total / subject));
        scanner.close();
    }
}
