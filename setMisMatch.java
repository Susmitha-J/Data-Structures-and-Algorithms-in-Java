class Solution {
    public int[] findErrorNums(int[] nums) {
        //using mappings
        // int missing[] = new int[2];
        // int hash[] = new int[nums.length];

        // for(int i=0;i<nums.length;i++) {
        //     hash[nums[i]-1] += 1;
        // }

        // for(int i=0;i < nums.length;i++) {
        //     if(hash[i] == 0){ missing[1] = i+1;
        //     } else if(hash[i] == 2) missing[0] = i+1; 

        // }
        int missing[] = new int[2];
        for(int i=0;i<nums.length;i++) {
            int idx = Math.abs(nums[i]) - 1;
            if(nums[idx] < 0) {
                missing[0] = Math.abs(nums[i]);
            } else nums[idx] = -nums[idx];
        }

        for(int i=0;i<nums.length;i++) {
            if(nums[i] > 0){
                missing[1] = i+1;
            }
        }
    

        return missing;

    }
}