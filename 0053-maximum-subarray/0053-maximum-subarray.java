class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = 0; i < nums.length; i++) {
            currSum = getMaxInt(nums[i], currSum + nums[i]);
            maxSum = getMaxInt(maxSum, currSum);
        }
        return maxSum;
    }

    public int getMaxInt(int num1, int num2) {
        if(num1 > num2) {
            return num1;
        }
        return num2;
    }
}