class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0, ans = 0;
        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                open++;
            } else {
                if(ch == ')') {
                    open--;
                }
                if(open < 0) {
                    ans++;
                    open = 0;
                }
            }
        }
        return ans + open;
    }
}