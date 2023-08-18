class Solution {
    public String removeStars(String s) {
        int i = 0, j = 0;
        char [] str = s.toCharArray();
        for(i = 0; i < s.length(); i++) {
            if(str[i] == '*') {
                j--;
            } else {
                str[j] = str[i];
                j++;
            }
        }
        return new String(str, 0, j);
    }
}