package assignment.basic;

import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args) {
        System.out.print("Enter Side of Rhombus : ");
        Scanner scanner = new Scanner(System.in);
        int side = scanner.nextInt();
        System.out.println("Perimeter of Rhombus :: " + 4 * side);
    }
}
