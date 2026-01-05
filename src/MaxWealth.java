public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 4, 5}, {6, 7, 8}};

        System.out.println("Maximum Amount::" + maxWealth(accounts));
    }

    private static int maxWealth(int[][] accounts) {

        int max = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int rowSum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                rowSum += accounts[person][account];
            }
            if (max < rowSum) max = rowSum;
        }

        return max;
    }
}