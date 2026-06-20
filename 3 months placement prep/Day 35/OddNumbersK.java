class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums, k) - atmost(nums, k-1);
    }

    public int atmost(int[] nums, int k) {
        if(k < 0) return 0;
        int oddcount = 0, ans = 0;
        int left = 0, right = 0;
        while(right < nums.length) {
            if(nums[right]%2!=0) oddcount += 1;
    
            while(oddcount > k) {
                if(nums[left]%2 != 0) oddcount--;
                left++;
            }

            
            ans += right - left + 1;
            

            right++;
        }

        return ans;
    }
}