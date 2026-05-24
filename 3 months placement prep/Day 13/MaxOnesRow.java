class Solution {
    public int rowWithMax1s(int[][] arr) {
        // code here
        int maxonesrow = -1;
        int max = -1;
        for(int i = 0;i< arr.length;i++) {
          
           int idx =  getFirstIndex(arr[i]);
           if(idx != -1) {
               int count = arr[i].length - idx; 
               if(count > max)  {
                   maxonesrow = i;
                   max = count;
               }
           }
        }
        return maxonesrow;
    }
    
    
    public int getFirstIndex(int arr[]) {
        
        int left = 0, right = arr.length - 1;
        while(left <= right) {
            int mid = (left+ right)/2;
            if(arr[mid] == 1) {
                right = mid -1;
            }else{
                left = mid+1;
            }
        }
        
        if(left >= arr.length) return -1;
        
        return left;
    }
};