class Solution {
    public List<String> summaryRanges(int[] nums) {
        if(nums.length == 0) {
            return new ArrayList<>();
        }
        List<String> summary = new ArrayList<>();       
        int left = 0, right = 0;
        String interval;

        for(int i=1;i<nums.length;i++) {
            if(nums[i] - nums[i-1] == 1) {
                right++;
            } else{
                if(left == right) summary.add(String.valueOf(nums[left]));
                else summary.add(String.join("->", String.valueOf(nums[left]), String.valueOf(nums[right])));
                    right++;
                    left = right;
        
            }
           
        }

         if(left == right) summary.add(String.valueOf(nums[left]));
                else{
                    summary.add(String.join("->", String.valueOf(nums[left]), String.valueOf(nums[right])));
                    right++;
                    left = right;
                }

        return summary;

    }
}