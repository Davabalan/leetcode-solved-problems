class Solution {
    public int mySqrt(int x) {
        if(x == 0) {
            return 0;
        }
        long low = 1, high = x;
        long ans = 0;
        while(low <= high) {
            long mid = (low + high) / 2;
            if((mid * mid) <= x) {
                low = mid + 1;
                ans = mid;
            } else {
                high = mid - 1;
            }
        }
        return (int) ans;
    }
}