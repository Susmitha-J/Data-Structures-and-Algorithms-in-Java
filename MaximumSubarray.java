class Solution {
    public int maxSubArray(int[] nums) {

        if(nums.length == 1) return nums[0];

        //brute force
        int maxSum = 0, sum;
        for(int i=0;i<nums.length-1;i++) {
             sum = nums[i];
            for(int j=i+1;j<nums.length;j++) {
                sum += nums[j];
                if(sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
        
    }
}