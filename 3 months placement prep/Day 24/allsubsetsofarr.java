class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> sets = new ArrayList<>();
        
        int idx = 0;
        List<Integer> subsets = new ArrayList<>();
        powerset(nums, idx, subsets, sets);

        return sets;
    }

    public void powerset(int nums[], int idx, List<Integer> subset, List<List<Integer>> sets) {
        if(idx >= nums.length) {
            sets.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[idx]);
        powerset(nums, idx+1, subset, sets);

        subset.remove(subset.size() - 1);
        powerset(nums, idx+1, subset, sets);

        return;
    }
}
