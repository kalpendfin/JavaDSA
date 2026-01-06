package assignment.basic;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.print("Enter Circle Radius : ");
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        float PI = 3.14f;
        double area = PI * radius * radius;
        System.out.println("Area of Circle : " + area);
    }
}