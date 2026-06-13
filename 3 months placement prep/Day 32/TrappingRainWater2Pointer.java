class Solution {
    public int trap(int[] height) {
        int left=0, right = height.length-1;
        int leftMax = Integer.MIN_VALUE;
        int rightMax = Integer.MIN_VALUE;
        int trappingWaterVolume =0;
        while(left<right) {

            if(height[left] >= leftMax) {
                leftMax = height[left];
            } else{
                     trappingWaterVolume = trappingWaterVolume + (Math.min(leftMax, rightMax) - height[left]);
            } 

            if(height[right] >= rightMax) {
                rightMax = height[right];
            }else{
                trappingWaterVolume = trappingWaterVolume + (Math.min(leftMax, rightMax) - height[right]);
            }

            if(height[left] < height[right]) {
                left++;
            }else{
                right--;
            }

        }

        return trappingWaterVolume;
    }
}