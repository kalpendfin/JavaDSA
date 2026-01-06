package assignment.basic;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        System.out.print("Enter Height of Parallelogram : ");
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        System.out.print("Enter Base of Parallelogram : ");
        int base = scanner.nextInt();
        double area = height * base;
        System.out.println("Area of Parallelogram : " + area);
    }
}
