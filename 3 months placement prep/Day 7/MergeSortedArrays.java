class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int finalpointer = n+m - 1;
        int pointer1 = m-1, pointer2 = n-1;
        while(finalpointer >= 0) {
            if(pointer1 >= 0 && pointer2 >= 0 && nums1[pointer1] > nums2[pointer2]){
                nums1[finalpointer] = nums1[pointer1--];
            } else {
                if(pointer2>=0) {
                     nums1[finalpointer] = nums2[pointer2--];
                }
            }
            finalpointer--;
        }
    }
}