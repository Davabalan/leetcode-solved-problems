class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();
        int count = 0, ans = 0;
        boolean consecutive = true;
        for(int i : nums) {
            //  System.out.println(i);
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        // System.out.println(map);
        for(int i : nums) {
            count = 0;
            consecutive = true;
            // System.out.println("checking: " + i + " " + map.containsKey(i - 1));
            if(!map.containsKey(i - 1)) {
                // System.out.println("checking: " + i);
                while(consecutive) {
                    count++;
                    // System.out.println("checking: " + i + " "+ "count: " + count);
                    if(!map.containsKey(i + count)) {
                        consecutive = false;
                    }
                }
            }
            ans = Math.max(count, ans);
        }
        return ans;
    }
}