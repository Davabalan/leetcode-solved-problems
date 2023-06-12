class Solution {
    public int[] searchRange(int[] nums, int target) {
               int start =0;
        int end  = nums.length-1;
        int mid;
        int[] output = {-1,-1};
        while(start<=end){
            mid = start+(end-start)/2;
            if(nums[mid] == target){
                output[0]=mid;
                end =mid-1;
            }
            else if(nums[mid]<target){
                start =mid+1;
            }
            else{
                end =mid-1;
            }
        }
        start =0;
        end= nums.length-1;
        while(start<=end){
            mid = start+(end-start)/2;
            if(nums[mid] == target){
                output[1]=mid;
                start =mid+1;
            }
            else if(nums[mid]<target){
                start =mid+1;
            }
            else{
                end =mid-1;
            }
        }
        return output; 
    }
}