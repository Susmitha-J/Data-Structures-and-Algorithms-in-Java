class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if(n==1) return 0;

        int moves = 0;
        int maxRange = 0;
        int curr = 0;
        int i = 0;
        while(i<n-1) {
            maxRange = Math.max(maxRange, nums[i] + i);
            
            if(i== curr) {
                moves++;
                curr = maxRange;
            }
            i++;
        }

        return moves;
    }
}