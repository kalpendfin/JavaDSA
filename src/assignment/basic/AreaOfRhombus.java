package assignment.basic;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        System.out.print("Enter p-Diagonal of Rhombus : ");
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        System.out.print("Enter q-Diagonal of Rhombus : ");
        int base = scanner.nextInt();
        double area = (double) (height * base) / 2;
        System.out.println("Area of Rhombus : " + area);
    }
}