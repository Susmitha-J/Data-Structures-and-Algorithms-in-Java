class Solution {
    public void sortColors(int[] nums) {
       int right = nums.length - 1, left = 0, mid = 0;
       while(mid <= right) {
            if(nums[mid] == 0) {
                int temp = nums[mid];
                nums[mid] = nums[left];
                nums[left] = temp;

                left++;
                mid++;
            } else if(nums[mid] == 2) {
                int temp = nums[mid];
                nums[mid] = nums[right];
                nums[right] = temp;
            right--;
            } else{
                mid++;
            }
       }

    }
    public void sortColorsUsingCount(int[] nums) {
         int c0 = 0, c1 = 0;
        for(int i =0;i<nums.length;i++) {
            if(nums[i] == 0 ) c0++;
            if(nums[i] == 1) c1++;
        }
        for(int i=0;i<nums.length;i++){
                if( i< c0) nums[i] = 0;
                else if(i < c0+c1) nums[i] = 1;
                else {
                    nums[i] = 2;
                }
        }
    }
}