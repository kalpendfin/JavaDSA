package assignment.basic;

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        System.out.println("Curved Surface Area of Cylinder");
        System.out.print("Enter Radius : ");
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        System.out.print("Enter Height : ");
        int height = scanner.nextInt();
        double volume = 2 * Math.PI * radius * height;
        System.out.println("Area : " + volume);

    }
}
