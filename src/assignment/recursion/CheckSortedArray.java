package assignment.recursion;

public class CheckSortedArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] array = {1, 2,1};
        System.out.println("Array sorted = " + sortedArray(array, 0));
    }

    private static boolean sortedArray(int[] array, int i) {

        if (array.length == 0 || array.length == 1) {
            return true;
        }

//        System.out.println(i);
        if (i == array.length - 1) return true;

        return (array[i] <= array[i + 1]) && (sortedArray(array, i + 1));
    }
}
