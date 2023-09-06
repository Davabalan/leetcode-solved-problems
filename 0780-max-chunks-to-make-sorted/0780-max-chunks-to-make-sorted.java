class Solution {
    public int maxChunksToSorted(int[] arr) {
        int indexSum = 0, sum = 0, chunkCount = 0;
        for(int i = 0; i < arr.length; i++) {
            indexSum = indexSum + i;
            sum = sum + arr[i];
            if(sum == indexSum) {
                chunkCount++;
            }
        }
        return chunkCount;
    }
}