class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while(low <= high) {
            if(nums[low] <= nums[high]) {
                return nums[low];
            }
            int mid = (low + high) / 2;
            if(low < mid && nums[mid - 1] > nums[mid]) {
                return nums[mid];
            } 
            if(mid < high && nums[mid + 1] < nums[mid]) {
                return nums[mid + 1];
            }
            
            if(nums[low] < nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}