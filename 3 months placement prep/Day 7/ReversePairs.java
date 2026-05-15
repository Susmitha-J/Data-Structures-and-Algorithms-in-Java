class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }

    public int mergeSort(int[] nums, int left, int right) {
        if (left >= right) return 0;

        int mid = left + (right - left) / 2;
        int count = 0;

        count += mergeSort(nums, left, mid);
        count += mergeSort(nums, mid + 1, right);

        // Count reverse pairs
        int j = mid + 1;
        for (int i = left; i <= mid; i++) {
            while (j <= right &&
                   (long) nums[i] > 2L * nums[j]) {
                j++;
            }
            count += (j - (mid + 1));
        }
        
        merge(nums, left, mid, right);

        return count;
    }

    public void merge(int nums[], int left, int mid , int right) {
        int temp[] = new int[right - left + 1];

        int i = left, j = mid+1;
        int p = 0, count = 0;
        while(i <= mid && j <= right) {
            if(nums[i] <= nums[j]) {
                temp[p++] = nums[i++];
            } else {
                temp[p++] = nums[j++];
            }
        }

        while(i<= mid) {
            temp[p++] = nums[i++];
        }

        while(j <= right) {
            temp[p++] = nums[j++];
        }

        for(i=left,p=0;i<=right;i++,p++) {
            nums[i] = temp[p];
        }
    }
}