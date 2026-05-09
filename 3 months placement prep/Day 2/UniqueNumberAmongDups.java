class Solution {
    public int singleNumber(int[] nums) {
        int unique = nums[0], n = nums.length;
        for(int i = 1;i<n;i++) {
            unique = unique ^ nums[i];
        }
        return unique;
    }
}