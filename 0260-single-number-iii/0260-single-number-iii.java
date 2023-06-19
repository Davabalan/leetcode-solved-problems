class Solution {
    public int[] singleNumber(int[] nums) {
        int xorResult = 0, x = 0, y = 0;
        int[] twoUniqueElements = new int[2];
        for( int i = 0; i < nums.length; i++) {
            xorResult = xorResult ^ nums[i];
        }

        //Find Last set Bit
        int lsb = xorResult & ~(xorResult - 1);
        
        for (int i : nums)
        {
            // Seggregate set bits from the array
            if ((i & lsb) != 0) {
                x = x ^ i;
            }
 
            // elements that don't have the bit set
            else {
                y = y ^ i;
            }
        }
        twoUniqueElements[0] = x;
        twoUniqueElements[1] = y;
        return twoUniqueElements;
    }
}