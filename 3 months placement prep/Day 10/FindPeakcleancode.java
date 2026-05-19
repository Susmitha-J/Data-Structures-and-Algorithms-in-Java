class Solution {
    public int findPeakElement(int[] nums) {
        // int n = nums.length;

        // if(n==1) return 0;
       
        // if(n>1 && nums[0] > nums[1]) return 0;
        
        // if(n>=2 && nums[n-1] > nums[n-2]) return n-1;

        // int left = 1;
        // int right = n-2;

        // while(left <= right) {
        //     int mid = (left + right)/2;
        //     if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) return mid;
        //     else if(nums[mid]  > nums[mid-1] && nums[mid] < nums[mid+1]) {
        //         left = mid+1;
        //     } else if(nums[mid] > nums[mid+1] && nums[mid-1] > nums[mid]){
        //         right = mid-1;
        //     } else {
        //         left = mid+1;
        //     }
        // }

        // return -1;

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1]) {
                right = mid;    
            } else {
                left = mid + 1;  
            }
        }

        return left;    
    
    }
}