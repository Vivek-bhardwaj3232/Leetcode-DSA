class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int totalRow = matrix.length;
        int totalCol = matrix[0].length;

        int n = totalRow*totalCol;
        int f = 0;
        int l = n-1;

        while(f<=l){
            int m = f + (l-f)/2;
            int rowIndex = m/totalCol;
            int colIndex = m%totalCol;

            if(matrix[rowIndex][colIndex] == target) return true;
            else if(matrix[rowIndex][colIndex] < target) f = m+1;
            else l = m-1; 
        }
        return false;
    }
}