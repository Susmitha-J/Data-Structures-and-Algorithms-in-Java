class Solution {
    public int findPages(int[] arr, int k) {
        //edge case for impossible
        if(k > arr.length) return -1;
        
        int maxPages = arr[0], sum = arr[0];
        for(int i= 1;i<arr.length;i++) {
            if(arr[i] > maxPages) maxPages = arr[i];
            sum += arr[i];
        }
        
        int left = maxPages, right = sum;
        int minofmax = -1;
        while(left <= right) {
            int mid = (left + right)/2;
            if(studentscounted(arr, mid) <= k) {
                minofmax = mid;
               right = mid-1;
            }  else {
                left = mid+1;
            }
        }
        
        return minofmax;
       
    }
    
    public int studentscounted(int arr[], int maxpages ) {
        int studentcount = 1;
        int prevpages = 0;
        for(int i=0;i<arr.length;i++) {
            if(prevpages + arr[i] > maxpages) {
                studentcount++;
                prevpages = arr[i];
            } else{
                prevpages += arr[i];
            }
        }
        
        return studentcount;
    }
}