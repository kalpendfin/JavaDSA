package assignment.basic;

import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        System.out.println("Total Surface Area Of Cube :");
        System.out.print("Enter Cube Area : ");
        Scanner scanner = new Scanner(System.in);
        int area = scanner.nextInt();
        double areaS = 6 * area * area;
        System.out.println("Total Surface Area Of Cube : " + areaS);
    }
}
