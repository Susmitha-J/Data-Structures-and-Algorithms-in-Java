class Solution {
    public void rotate(int[][] matrix) {

    
    int n = matrix.length;

    //transpose
    for(int i =0;i<n;i++) {
        for(int j=i+1;j<n;j++) {
            if(i!=j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    //reverse
    for(int i=0;i<n;i++){
        reverse(matrix, i, n);
    }

    }

    public void reverse(int[][] matrix, int i, int n) {
        int left = 0;
        int right = n-1;
        while(left < right) {
            int temp = matrix[i][left];
            matrix[i][left] = matrix[i][right];
            matrix[i][right] = temp;
            left++;
            right--;
        }
    }

}