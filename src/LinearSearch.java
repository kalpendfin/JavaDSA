public class LinearSearch {
    public static void main(String[] args) {
        int num[] = {23, 45, 1, 2, 8, 19, -3, -4, 16, -11, 28};
        int target = 190;

        int ans = linearSearch(num, target);
        System.out.println(ans);
    }

    private static int linearSearch(int[] num, int target) {

        if (num.length == 0) {
            return -1;
        }

        for (int index = 0; index < num.length; index++) {
            int element = num[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}