public class SearchInRange {

    public static void main(String[] args) {
        int[] num = {23, 45, 1, 2, 8, 19, -3, -4, 16, -11, 28};
        int target = 23;
        int start = 3;
        int end = 5;

        int ans = linearSearch(num, target, start, end);
        System.out.println(ans);

    }

    private static int linearSearch(int[] num, int target, int start, int end) {

        if (num.length == 0) {
            return -1;
        }

        for (int index = start; index <= end; index++) {
            int element = num[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}
