class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int left = 0, right = matrix.length - 1;

        while(left <= right) {
            int mid = (left + right )/2;
            if(matrix[mid][0] == target) return true;
            if(matrix[mid][0] > target) {
                right = mid-1;
            } else{
                left = mid+1;
            }
        }

        if(right < 0) return false;
        
        int col = right;
        
       left = 0;
       right = matrix[0].length - 1;
        while(left <= right) {
            int mid = (left + right)/2;
            if(matrix[col][mid] == target) return true;
            else if(matrix[col][mid] > target) right = mid-1;
            else left  = mid+1;
        }

        return false;
    }
}