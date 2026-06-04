class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> combinations = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();

        combsum(candidates, target, 0, combination, combinations);
        return combinations;
    }

    public void combsum(int[] candidates, int target, int idx, List<Integer> list, List<List<Integer>> combinations){ 

        if(target == 0) {
            combinations.add(new ArrayList(list));
            return;
        }

        if(idx == candidates.length) {
             return;
        }

        
        if(target >= candidates[idx]) {
            list.add(candidates[idx]);
            combsum(candidates, target - candidates[idx], idx, list, combinations);
            list.remove(list.size()-1);
        }
        
        combsum(candidates, target, idx+1, list, combinations);
        return;

    }
}