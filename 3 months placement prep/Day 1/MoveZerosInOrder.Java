class Solution {
    public void moveZeroes(int[] nums) {
        int n  = nums.length;
        if(n==1) return;

        int pointer1 = 0, pointer2 = 1;
        while(pointer2 < n) {
            if(nums[pointer1] == 0)  {
                while(pointer2 < n && nums[pointer2] == 0) pointer2++;

                if(pointer2 < n){
                nums[pointer1] = nums[pointer2];
                nums[pointer2] = 0;
                }
            }
             pointer1++;
             pointer2 = pointer1+1;
        }
       
    }
}