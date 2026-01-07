package assignment.basic;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        System.out.print("Enter Circle Radius : ");
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        float PI = 3.14f;
        double area = 2 * PI * radius;
        System.out.println("Perimeter of Circle : " + area);

    }
}
