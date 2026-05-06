class Solution {
    public int firstMissingPositive(int[] nums) {
        int range = nums.length;
        for(int i=0;i<range;i++) {
            while(nums[i] > 0 && nums[i] <=range && nums[nums[i]-1]!= nums[i]){
                    int idx = nums[i] - 1;
                    int temp = nums[i];
                    nums[i] = nums[idx];
                    nums[idx] = temp;
            }
        }

        for(int i=0;i<range;i++) {
            if(nums[i]!=i+1){
                return i+1;
            }
        }

        return range+1;
    }
}