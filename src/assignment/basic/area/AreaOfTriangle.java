package assignment.basic.area;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        System.out.print("Enter Height of Triangle : ");
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        System.out.print("Enter Base : ");
        int base = scanner.nextInt();
        double area = 0.5 * height * base;
        System.out.println("Area of Triangle : " + area);
    }
}