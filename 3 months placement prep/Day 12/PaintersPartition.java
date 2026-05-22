class Solution {
    public int minTime(int[] arr, int k) {
        // code her
        
          //edge case for impossible
        if(k > arr.length) return -1;
        
        int max = arr[0], sum = arr[0];
        for(int i= 1;i<arr.length;i++) {
            if(arr[i] > max) max = arr[i];
            sum += arr[i];
        }
        
        int left = max, right = sum;
        int maxofmin = -1;
        while(left <= right) {
            int mid = (left + right)/2;
            if(painterscounted(arr, mid) <= k) {
                maxofmin = mid;
               right = mid-1;
            }  else {
                left = mid+1;
            }
        }
        
        return maxofmin;
        
    }
    
     public int painterscounted(int arr[], int maxtime ) {
        int painterscount = 1;
        int prevtime = 0;
        for(int i=0;i<arr.length;i++) {
            if(prevtime + arr[i] > maxtime) {
                painterscount++;
                prevtime = arr[i];
            } else{
                prevtime += arr[i];
            }
        }
        
        return painterscount;
    }
}
