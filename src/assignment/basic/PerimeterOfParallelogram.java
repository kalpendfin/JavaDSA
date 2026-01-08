package assignment.basic;

import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        System.out.print("Enter Base of Parallelogram : ");
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        System.out.print("Enter Side of Parallelogram : ");
        int side = scanner.nextInt();

        System.out.println("Perimeter of Parallelogram : " + 2 * (base + side));

    }
}