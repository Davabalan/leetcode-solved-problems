class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int size = nums.length;
        for(int i = 0; i < size; i++) {
            minHeap.add(nums[i]);
            
            if(minHeap.size() > k) {
                minHeap.remove();
            }
        }
        return minHeap.peek();
    }
}