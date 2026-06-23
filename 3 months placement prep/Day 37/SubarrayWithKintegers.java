class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
       return atmost(nums, k) - atmost(nums, k-1);
    }

    public int atmost(int[] nums, int k) {
        if(k < 0) return 0;

        int left = 0, right = 0;

        Map<Integer, Integer> map = new HashMap();
        int total = 0;

        while(right < nums.length) {
            map.put(nums[right], map.getOrDefault(nums[right] , 0)+1);

            while(map.size() > k) {
                map.put(nums[left], map.get(nums[left])-1);
                if(map.get(nums[left]) == 0 ) map.remove(nums[left]);
                left++;
            }

            total += right - left + 1;
            right++;
        }

        return total;
    }
}