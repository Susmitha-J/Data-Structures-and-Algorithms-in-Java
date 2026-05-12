class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] row = new int[n];
        int[] col = new int[m];


        for(int i =0;i< n;i++) {
            for(int j=0;j< m;j++) {
                if(matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for(int i=0;i<n;i++) {
            if(row[i] == 1) {
                rowZerosIdx(matrix, i, m);
            }
        }

        for(int i=0;i<m;i++){
            if(col[i] == 1){
                colZerosIdx(matrix, i, n);
            }
        }

        
    }

    public void rowZerosIdx(int[][] matrix, int idx, int m){
        //fill for all column in that row
        for(int i=0;i<m;i++) {
            matrix[idx][i] = 0;
        }
    }

    public void colZerosIdx(int[][] matrix, int idx, int n) {
        //fill for all rows in that column 
        for(int i=0;i<n;i++) {
            matrix[i][idx] = 0;
        }
    }

}