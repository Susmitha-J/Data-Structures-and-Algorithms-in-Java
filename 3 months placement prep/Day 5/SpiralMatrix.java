class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rowbeg = 0, colbeg = 0, rowend = matrix.length-1, colend = matrix[0].length - 1;
        List<Integer> spiral = new ArrayList<Integer>();

        //Spiralling 
        while(rowbeg <= rowend && colbeg <= colend) {

            //left to right
            for(int i = colbeg;i<=colend;i++) {
                spiral.add(matrix[rowbeg][i]);
            }
            rowbeg++;
            

            //right top to bottom 
            for(int j = rowbeg; j<= rowend;j++) {
                spiral.add(matrix[j][colend]);
            }
            colend--;

            //right to left
            if(rowbeg <= rowend) {
            for(int j = colend; j>= colbeg; j--) {
                spiral.add(matrix[rowend][j]);
            }
            rowend--;
            }

            //left bottom to top
            if(colbeg <= colend) {
            for(int j= rowend;j>=rowbeg;j--) {
                spiral.add(matrix[j][colbeg]);
            }
            colbeg++;
            }
        }

        return spiral;
    }
}