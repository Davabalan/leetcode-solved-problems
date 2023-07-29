class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int sum = 0;

        for(int i = 0; i < n; i++) {
            sum += nums[i];
        }

        if(Math.abs(target) > sum || (sum + target) % 2 != 0) { // sum is odd or less than target
            return 0;
        }

        int m = (sum - target) / 2; // target
        int [][] dp = new int[n + 1][m + 1];

        for(int i = 0; i < n + 1; i++) {
            dp[i][0] = 1;
        }

        for(int i = 1; i < n + 1; i++) {
            for(int j = 0; j < m + 1; j++) {
                if(nums[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - nums[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][m];
    }
}