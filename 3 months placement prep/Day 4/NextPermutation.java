class Solution {
    public void nextPermutation(int[] nums) {
        
        //finding to replace with next greater element
        int bp = getbreakpoint(nums);

        //last permutation is given next stage is sorted
        if(bp == -1) {
            reverse(nums, bp);
            return;
        }

        int nextGreater = getNextGreater(nums, bp);

        int temp = nums[nextGreater];
        nums[nextGreater] = nums[bp];
        nums[bp] = temp;

        reverse(nums, bp);

        return;


    }
    public int getbreakpoint(int[] nums)  {
        int breakpoint = -1;
        for(int i = nums.length-2;i>=0;i--) {
            if(nums[i] < nums[i+1]) {
                breakpoint = i;
                break;
            }
        }
        return breakpoint;
    }

    public int getNextGreater(int nums[], int bp) {
        
        for(int i = nums.length-1;i>bp;i--) {
            if(nums[i] > nums[bp]) {
                return i;
            }
        }

        return -1;
    }

    public void reverse(int[] nums, int bp) {
        int left = bp+1;
        int right = nums.length-1;
        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}