class Solution {
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int [][] Arr = new int [m][n];
        int ans = 0;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if( i == 0 || j == 0 ) {
                    if(matrix[i][j] == '1') {
                        Arr[i][j] = 1;
                    }
                } else {
                    if(matrix[i][j] == '1') {
                        Arr[i][j] = Math.min(Math.min(Arr[i - 1][j],
                                            Arr[i][j - 1]),
                                            Arr[i - 1][j - 1]) + 1;
                    }
                }
                ans = Math.max(ans, Arr[i][j]);
            }
        }
        return ans * ans;
    }
}