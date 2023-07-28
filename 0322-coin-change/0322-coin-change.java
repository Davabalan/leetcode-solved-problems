class Solution {
    public int coinChange(int[] coins, int amount) {
        int m = coins.length, n = amount;
        int [][] dp = new int [m + 1][n + 1];

        for(int j = 1; j < n + 1; j++) { // fill infinity or max value
            dp[0][j] = Integer.MAX_VALUE - 1;
        }

        for(int i = 1; i < m + 1; i++) {
            for(int j = 1; j < n + 1; j++) {
                if(j < coins[i - 1]) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j], 1 + dp[i][j - coins[i - 1]]);
                }
            }
        }
        return dp[m][n] > 10000 ? -1: dp[m][n];
    }
}