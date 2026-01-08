package assignment.basic;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        System.out.print("Enter Length Rectangle : ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        System.out.print("Enter Width of Rectangle : ");
        int width = scanner.nextInt();
        System.out.println("Perimeter of Rectangle : " + 2 * (length + width));
    }
}
