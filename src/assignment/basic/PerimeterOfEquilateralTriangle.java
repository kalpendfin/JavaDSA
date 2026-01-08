package assignment.basic;

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        System.out.print("Enter Side of Equilateral Triangle : ");
        Scanner scanner = new Scanner(System.in);
        int area = scanner.nextInt();
        System.out.println("Perimeter of Equilateral Triangle : " + 3 * area);
    }
}