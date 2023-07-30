class Solution {
    public int longestValidParentheses(String s) {
        int open = 0, close = 0, ans = 0;
        // from left to right
        for( char ch : s.toCharArray()) {
            if(ch == '(') {
                open++;
            } else {
                close++;
            }

            if(close > open) {
                close = open = 0;
            }
            if(open == close) {
                ans = Math.max(ans, open + close);
            }
        }

        // from right to left
        close = open = 0;
        for(int l = s.length() - 1; l >= 0; l--) {
            if(s.charAt(l) == ')') {
                close++;
            } else {
                open++;
            }

            if(open > close) {
                open = close = 0;
            }

            if(close == open) {
                ans = Math.max(ans, close + open);
            }
        }
        return ans;
    }
}