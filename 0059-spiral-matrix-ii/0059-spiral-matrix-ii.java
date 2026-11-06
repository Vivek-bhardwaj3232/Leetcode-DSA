class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][] = new int[n][n];
        int ele = 1;
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = n-1;

        while(left<=right && top<=bottom){
            for(int i=left; i<=right; i++){
                matrix[top][i] = ele;
                ele++;
            }
            for(int i=top+1; i<=bottom; i++){
                matrix[i][right] = ele;
                ele++;
            }
            for(int i=right-1; i>=left; i--){
                if(top == bottom){
                    break;
                }
                matrix[bottom][i] = ele;
                ele++;
            }
            for(int i=bottom-1; i>=top+1; i--){
                if(left ==  right){
                    break;
                }
                matrix[i][left] = ele;
                ele++;
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return matrix;
    }
}