class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> combinations = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        Arrays.sort(candidates);
        fun(candidates, target, 0, combination, combinations);

        return combinations;
    }

    public void fun(int[] candidates, int target, int idx, List<Integer> combination, List<List<Integer>> combinations)
    {
        if(target == 0) {
            combinations.add(new ArrayList(combination));
            return;
        }

        if(idx == candidates.length) {
            return;
        }

        if(candidates[idx] > target)  {
            return;
        }

        if(candidates[idx] <= target ) {
            combination.add(candidates[idx]);
            fun(candidates,target - candidates[idx], idx+1,combination, combinations);
            combination.remove(combination.size()-1);
        }

        int next = idx + 1;
        while (next < candidates.length &&
               candidates[next] == candidates[idx]) {
            next++;
        }

        fun(candidates, target, next, combination, combinations);

        return;

    }
}