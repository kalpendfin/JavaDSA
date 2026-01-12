package assignment.basic.volume;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        System.out.println("Volume of Pyramid");
        System.out.print("Enter Radius : ");
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        System.out.print("Enter Height : ");
        int height = scanner.nextInt();
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of Pyramid : " + volume);
    }
}
