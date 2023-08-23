class Solution {
    public int jump(int[] nums) {
        int jumps = 0, farthest = 0, current = 0;
        for(int i = 0; i < nums.length - 1; i++){
            farthest = Math.max(farthest, nums[i] + i);
            if( i == current) {
                current = farthest;
                jumps++;
            }
        }
        return jumps;
    }
}