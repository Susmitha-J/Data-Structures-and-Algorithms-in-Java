class Solution {
    public boolean binarySearch(int[] arr, int k) {
        
        // code here
        int n = arr.length;
        if(n==1) {
            if(arr[0] == k) return true;
            else return false;
        }
        
        int left = 0, right = n-1, mid;
        while(left <= right) {
            mid = (left + right) / 2;
            if(arr[mid] == k) return true;
            
            if(arr[mid] < k) left = mid+1;
            else if (arr[mid] > k) right = mid-1;
            
        }
        return false;
    }
}