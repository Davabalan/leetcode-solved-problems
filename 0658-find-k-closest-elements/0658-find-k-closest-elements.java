class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        int i = 0, j = arr.length - 1;
        // binary search select the positions with 2 pointers
        while(j - i + 1 > k) {
            if(Math.abs(x - arr[i]) > Math.abs(x - arr[j])) {
                i++;
            } else {
                j--;
            }
        }
        // add elements between 2 pointers to result
        for(int l = i; l <= j; l++) {
            ans.add(arr[l]);
        }
        return ans;
    }
}