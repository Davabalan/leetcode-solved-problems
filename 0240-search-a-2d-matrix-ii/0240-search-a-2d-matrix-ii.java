class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0, col = matrix[0].length - 1;
        while(col >= 0 && row <= matrix.length - 1) {
            if(matrix[row][col] == target) {
                return true;
            } else if(matrix[row][col] > target) {
                col--;
            } else if(matrix[row][col] < target) {
                row++;
            }
        }
        return false;
    }
}