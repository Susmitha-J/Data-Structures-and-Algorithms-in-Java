class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // int n = nums.length;

        // int pointer1 = 0, pointer2 = 0, count = 0, max = 0;
        // while(pointer2 < n) {
        //     if(nums[pointer1] == 0) {
        //         pointer1++;
        //         pointer2 = pointer1;
        //     } else {
        //         while(pointer2 < n && nums[pointer2] != 0) {count++; pointer2++;}

        //         if(count > max) max = count;
        //         pointer1 = pointer2;

        //     }
        //     count = 0;
        // }
        // return max;

        return maxOnes(nums);

    }

    public int maxOnes(int nums[]) {
        int count = 0, max = 0, n = nums.length;

        for(int i=0;i< n;i++) {
            if(nums[i]!=0) count++;
            else{
                if(count > max)  max = count;
                count = 0;
            }
        }
        if(count > max) return count;
        return max;
    }
} 