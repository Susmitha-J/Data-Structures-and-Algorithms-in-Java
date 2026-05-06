class Solution {
    public boolean canJump(int[] nums) {
        int length = nums.length, maxjumps = 0;
        for(int i=0;i<length;i++) {
           if (i > maxjumps) {
                return false;
           }
           maxjumps = Math.max(nums[i]+i, maxjumps); 
        }

        return true;
    }
}