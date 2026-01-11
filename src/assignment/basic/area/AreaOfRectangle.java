package assignment.basic.area;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        System.out.print("Enter Rectangle Width : ");
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        System.out.print("Enter Rectangle Height : ");
        int height = scanner.nextInt();
        double area = width * height;
        System.out.println("Area of Rectangle : " + area);
    }
}