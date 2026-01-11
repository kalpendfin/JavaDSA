package assignment.basic.area;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        System.out.print("Enter area of Equilateral Triangle : ");
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        double area = Math.sqrt(3) * (double) (height * height) / 4;
        System.out.println("Area of Equilateral Triangle : " + area);

    }
}
