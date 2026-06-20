class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atmostsum(nums, goal) - atmostsum(nums, goal-1);
    }

    public int atmostsum(int[] nums, int goal) {
         if (goal < 0) return 0;
        int count = 0, currsum = 0;
        int left = 0, right = 0;
        while(right < nums.length) {
                currsum += nums[right];

                while(currsum > goal) {
                    currsum -= nums[left];
                    left++;
                }

                count += right - left + 1; 
                right++;
        }

        return count;
    }
}