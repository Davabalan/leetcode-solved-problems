class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<String>();
        func(ans, n, 0, 0, "");
        return ans;
    }

    public void func(List<String> ans, int n, int open, int close, String s) {
        if(s.length() == n * 2) {
            ans.add(s);
            return;
        }

        if(open < n) {
            func(ans, n, open + 1, close, s + "(");
        }
        
        if(close < open) {
            func(ans, n, open, close + 1, s + ")");
        }
    }
}