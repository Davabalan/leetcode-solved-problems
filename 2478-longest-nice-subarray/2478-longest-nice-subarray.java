class Solution {
    public int longestNiceSubarray(int[] nums) {
        int count = 0, nice = 0, left = 0;
        for(int right = 0; right < nums.length; right++) {
            while((nice & nums[right]) != 0) {
                nice = nice ^ nums[left++];
            }
            nice = nice | nums[right];
            count = Math.max(count, right - left + 1);
        }
        return count;
    }
}