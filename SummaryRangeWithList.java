class Solution {
    public List<String> summaryRanges(int[] nums) {
        if(nums.length == 0) {
            return new ArrayList<>();
        }
        List<String> summary = new ArrayList<>();       
        List<Integer> interval = new ArrayList<>();
        interval.add(nums[0]);

        for(int i=1;i<nums.length;i++) {
            if(nums[i]!= nums[i-1] + 1) {
                 if(interval.size() == 1) {
                    summary.add(String.valueOf(interval.get(0)));
                 } else {
                    String start = String.valueOf(interval.get(0));
                    String end = String.valueOf(interval.get(interval.size()-1));
                    summary.add(String.join("->",start, end));
                 }
                interval.clear();
            }

            interval.add(nums[i]);
        }

        if(interval.size() == 1) {
                    summary.add(String.valueOf(interval.get(0)));
                 } else {
                    String start = String.valueOf(interval.get(0));
                    String end = String.valueOf(interval.get(interval.size()-1));
                    summary.add(String.join("->",start, end));
                 }
        

        return summary;

    }
}