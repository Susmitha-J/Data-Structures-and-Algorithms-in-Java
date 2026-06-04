class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> combs = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();
        combinations( k,n, 1 , combs, comb);
        return combs;
        
    }

    public void combinations(int k, int n, int idx, List<List<Integer>> combs, List<Integer> comb) {
        if(n < 0) {
            return;
        }

        if(comb.size() == k) {
            if(n == 0) {
                combs.add(new ArrayList(comb));
                return;
            }
            return;
        }

        if(idx > 9) {
            return;
        }
        if(idx <= n) {
            comb.add(idx);
            combinations(k, n-idx, idx+1, combs, comb);
            comb.remove(comb.size()-1);
        }
        combinations(k, n, idx+1, combs, comb);

        return;

    }
}