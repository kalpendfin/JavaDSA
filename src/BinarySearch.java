import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        // Sorted Binary Array
        int[] binaryArray = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};

        System.out.print("Enter number to search :");
        Scanner input = new Scanner(System.in);
        int searchItem = input.nextInt();

        int answer = binarySearch(binaryArray, searchItem);
        System.out.println(answer);
    }

    private static int binarySearch(int[] binaryArray, int searchItem) {

        if (binaryArray.length == 0) {
            return -1;
        }

        int start = 0;
        int end = binaryArray.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (searchItem < binaryArray[mid]) {  // Searching in left part
                end = mid - 1;
            } else if (searchItem > binaryArray[mid]) {  // Searching in right part
                start = mid + 1;
            } else {  // mid element is target
                return mid;
            }
        }

        return -1;
    }
}
