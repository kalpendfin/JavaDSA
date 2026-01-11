package assignment.basic.volume;

import java.util.Scanner;

public class Prism {
    public static void main(String[] args) {
        System.out.println("Volume of Prism");
        System.out.print("Enter Base : ");
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        System.out.print("Enter Height : ");
        int height = scanner.nextInt();
        int volume = base * height;
        System.out.println("Volume of Prism is : " + volume);
    }
}