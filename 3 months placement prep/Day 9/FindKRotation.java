class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int min = Integer.MAX_VALUE;
        int left = 0, right = arr.length-1, minidx = -1;
        while(left <= right)  {
          int mid = (left + right )/ 2;
         
          if(arr[mid] < min) {
              min = arr[mid];
              minidx = mid;
          }
          

          if(arr[mid] < arr[right]) {
            right = mid -1;
          } else{
            left = mid + 1;
          }
 
        }
        return minidx;
    }
}