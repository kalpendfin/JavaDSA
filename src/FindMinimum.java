public class FindMinimum {
    public static void main(String[] args) {
        int[] num = {23, 45, 1, 2, 8, 19, -3, -4, 16, -11, -28};

        System.out.println(minimum(num));
    }

    private static int minimum(int[] arr) {
        int min = -1;
        if (arr.length == 0) {
            return min;
        }

        min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        return min;
    }
}
