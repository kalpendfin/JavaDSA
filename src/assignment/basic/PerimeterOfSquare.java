package assignment.basic;

import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        System.out.print("Enter Side of Square : ");
        Scanner scanner = new Scanner(System.in);
        int side = scanner.nextInt();
        System.out.println("Perimeter of Square :: " + 4 * side);
    }
}
