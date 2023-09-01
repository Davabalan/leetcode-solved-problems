class Solution {
    public void rotate(int[][] matrix) {
        int r = matrix[0].length;
        // Transpose of the matrix
        for(int i = 0; i < r; i++) {
            for(int j = i + 1; j < r; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // Reverse of the matrix
        for(int i = 0; i < r; i++) {
            int k = 0;
            int j = r - 1;
            while(k < j) {
                int temp = matrix[i][k];
                matrix[i][k] = matrix[i][j];
                matrix[i][j] = temp;
                k++;
                j--;
            }
        }
        // System.out.print(matrix);
    }
}