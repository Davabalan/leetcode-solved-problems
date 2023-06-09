class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        int pivot = -1;
        for(int i = 0; i < nums.length; i++) {
            rightSum += nums[i];
        }
        for(int i = 0; i < nums.length; i++) {
            //if(i > 0) {
              //  leftSum += nums[i-1];
            //}
            rightSum -= nums[i];
            if(leftSum == rightSum) {
               return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}