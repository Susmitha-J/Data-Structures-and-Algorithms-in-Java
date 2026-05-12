class Solution {
    public int longestConsecutive(int[] nums) {
       

        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }

        int max = 0,  j;
        for(int num: set) {
            if(!set.contains(num - 1)) {
                j = 0;
                while(set.contains(j+num)) j++;

                if(j > max) max = j;
            }
        }

        return max;
    }
}