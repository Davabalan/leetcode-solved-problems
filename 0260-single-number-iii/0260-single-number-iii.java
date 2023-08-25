class Solution {
    public int[] singleNumber(int[] nums) {
        int xorResult = 0, lsb = 0, x = 0, y = 0;
        int [] twoUniqueElements = new int[2];
        for(int i : nums) {
            xorResult = xorResult ^ i;
        }
        lsb = xorResult & ~(xorResult - 1);
        for(int i : nums) {
            if((lsb & i) != 0) {
                x = x ^ i;
            } else {
                y = y ^ i;
            }
        }
        twoUniqueElements[0] = x;
        twoUniqueElements[1] = y;
        return twoUniqueElements;
    }
}