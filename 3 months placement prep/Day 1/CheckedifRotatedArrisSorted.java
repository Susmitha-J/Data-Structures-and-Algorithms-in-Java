class Solution {
    public boolean check(int[] nums) {

        int n = nums.length;
        for(int rotations = 0;rotations < n; rotations++) {
            int[] sortedArr = rotateArr(nums, n, rotations);
            if(isSorted(sortedArr)) return true;
            else continue;
        }
        return false;
    }

    public int[] rotateArr(int[] nums, int n, int x){
        int[] rotatedArr = new int[n];
        for(int i=0;i<n;i++) {
            rotatedArr[i] = nums[(i+x) % n];
        }
        return rotatedArr;
    }

    public boolean isSorted(int[] arr) {
        for(int i=0;i< arr.length - 1;i++) {
            if(arr[i] > arr[i+1]) return false;
            else continue;
        }
        return true;
    }
}