class Solution {
    public int removeDuplicates(int[] nums) {
        int pointer = 0, n= nums.length;
        for(int i=1;i<n;i++) {
            if(nums[i] == nums[pointer]) continue;
            else nums[++pointer] = nums[i];
        }

        return pointer+1;
    }
}