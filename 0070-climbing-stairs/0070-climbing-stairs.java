class Solution {
    public int climbStairs(int n) {
        // Fibonacci Series
        int [] dp = new int[n + 1];
        dp[0] = 1;// only difference one step will have one possible path so initial value of series is 1
        dp[1] = 1;
        for(int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}