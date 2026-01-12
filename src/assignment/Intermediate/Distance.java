package assignment.Intermediate;

import java.util.Scanner;

public class Distance {
    //Calculate Distance Between Two Points
    public static void main(String[] args) {
        System.out.println("Calculate Distance Between Two Points");
        System.out.print("Enter 1st Position : ");
        Scanner scanner = new Scanner(System.in);
        int position1 = scanner.nextInt();
        System.out.print("Enter 2nd Position : ");
        int position2 = scanner.nextInt();

        int distance = position2 - position1;

        System.out.println("Distance in Meter : " + distance);
    }
}
