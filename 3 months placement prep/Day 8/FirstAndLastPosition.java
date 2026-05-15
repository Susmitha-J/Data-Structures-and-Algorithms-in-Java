class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = getFirstPosition(nums, target);
        arr[1] = getLastPosition(nums, target);
        return arr;
    }
    public int getFirstPosition(int[] nums, int target) {
        int left = 0, right = nums.length - 1, first = -1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) {
                first = mid;
                right = mid-1;
            } else if (nums[mid]  > target) right = mid-1;
            else left = mid+1;
        }

        return first;
    }

     public int getLastPosition(int[] nums, int target) {
        int left = 0, right = nums.length - 1, last = -1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) {
                last = mid;
                left = mid+1;
            } else if (nums[mid]  > target) right = mid-1;
            else left = mid+1;
        }

        return last;

    }
}