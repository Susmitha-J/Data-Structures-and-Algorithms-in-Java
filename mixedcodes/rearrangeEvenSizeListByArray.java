class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length / 2;
        int positiveArr[] = new int[n];
        int negativeArr[] = new int[n];
        int pos = 0, neg =0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]<0){
                negativeArr[neg] = nums[i];
                neg++;
            } else {
                positiveArr[pos] = nums[i];
                pos++;
            }
        }
        int posIndex = 0, negIndex = 0,i;
        for(i=0;i<nums.length;i++){
            if(i%2 == 0){
                nums[i] = positiveArr[posIndex];
                posIndex++;
            } else{
                nums[i] = negativeArr[negIndex];
                negIndex++;
            }
        }
        return nums;
    }
}