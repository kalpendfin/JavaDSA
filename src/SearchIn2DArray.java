public class SearchIn2DArray {

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5},
                {7, 8, 9, 10}
        };

        int target = 2;

//        System.out.println(Arrays.toString(search2DArray(array, target)));
        System.out.println(searchMax2DArray(array));
    }

    private static int[] search2DArray(int[][] array, int target) {

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }

        return new int[]{-1, -1};
    }

    private static int searchMax2DArray(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] > max) {
                    max = array[row][col];
                }
            }
        }

        return max;
    }

}
