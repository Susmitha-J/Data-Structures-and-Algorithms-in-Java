class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> sets = new ArrayList<>();
        
        int idx = 0;
        List<Integer> subsets = new ArrayList<>();
        Arrays.sort(nums);
        powerset(nums, idx, sets, subsets);
        return sets;
    }

    public void powerset(int nums[], int idx, List<List<Integer>> subsets, List<Integer> subset) {
        if(idx >= nums.length ) {
            subsets.add(new ArrayList(subset));
            return;
        }

        subset.add(nums[idx]);
        powerset(nums, idx+1, subsets, subset);
        int ele = subset.get(subset.size()-1);
        subset.remove(subset.size()-1);

        idx = idx+1;
        while(idx != nums.length && nums[idx] == ele){ 
            idx++;
        }
        powerset(nums, idx, subsets, subset);
        return;

            
    }




}