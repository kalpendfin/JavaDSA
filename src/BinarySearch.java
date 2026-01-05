import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        // Sorted Binary Array
        int[] binaryArray = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};

        System.out.println("Enter number to search");
        Scanner input = new Scanner(System.in);
        int searchItem = input.nextInt();

        int midIndex = binaryArray.length / 2;


        if (searchItem < binaryArray[midIndex]) {
            for (int i = 0; i < midIndex; i++) {
                if (searchItem == binaryArray[i]) {
                    System.out.println("Found at : " + i);
                    break;
                }
            }
//            System.out.println("Element does not exist in array");
        } else {
            for (int i = midIndex; i < binaryArray.length; i++) {
                if (searchItem == binaryArray[i]) {
                    System.out.println("Found at : " + i);
                    break;
                }
            }
//            System.out.println("Element does not exist in array");
        }
    }
}
