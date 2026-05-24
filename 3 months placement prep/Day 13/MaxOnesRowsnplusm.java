class Solution {
    public int rowWithMax1s(int[][] arr) {
        // code here
        // int maxonesrow = -1;
        // int max = -1;
        // for(int i = 0;i< arr.length;i++) {
          
        //   int idx =  getFirstIndex(arr[i]);
        //   if(idx != -1) {
        //       int count = arr[i].length - idx; 
        //       if(count > max)  {
        //           maxonesrow = i;
        //           max = count;
        //       }
        //   }
        // }
        // return maxonesrow;
        
        int n = arr.length;
        int m = arr[0].length;

        int row = 0;
        int col = m - 1;

        int maxRow = -1;

        while (row < n && col >= 0) {

            if (arr[row][col] == 1) {
                maxRow = row;
                col--;   // move left
            } else {
                row++;   // move down
            }
        }

        return maxRow;
        
        
    }
    
    
    // public int getFirstIndex(int arr[]) {
        
    //     int left = 0, right = arr.length - 1;
    //     while(left <= right) {
    //         int mid = (left+ right)/2;
    //         if(arr[mid] == 1) {
    //             right = mid -1;
    //         }else{
    //             left = mid+1;
    //         }
    //     }
        
    //     if(left >= arr.length) return -1;
        
    //     return left;
    // }
};