public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
//        System.out.println(digits(12345678));
    }

    static int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    private static boolean even(int num) {
        int digits = digits(num);
//        while (num > 0) {
//            digits++;
//            num = num / 10;
//        }

        return digits % 2 == 0;
    }

    private static int digits(int num) {
        if (num < 0)
            num = num * -1;

        return (int) (Math.log10(num)) + 1;
    }
}