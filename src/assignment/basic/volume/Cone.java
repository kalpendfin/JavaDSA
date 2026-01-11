package assignment.basic.volume;

import java.util.Scanner;

public class Cone {
    public static void main(String[] args) {
        System.out.println("Volume Of Cone");
        System.out.print("Enter Radius :: ");
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        System.out.print("Enter Height :: ");
        int height = scanner.nextInt();

        float PI = 3.14f;
        System.out.println("Volume of Cone :: " + (PI * radius * radius * height / 3));
    }
}