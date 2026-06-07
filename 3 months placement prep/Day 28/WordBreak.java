class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        Boolean[] memo = new Boolean[s.length()];
        return canBreak(s, wordSet, 0, memo);
    }

    public boolean canBreak(String s, Set<String> wordSet, int start, Boolean[] memo) {
        if(start == s.length()) {
            return true;
        }

        if(memo[start] != null) {
             return memo[start];
        }
        

        for(int i = start+1;i<=s.length();i++) {
            if(wordSet.contains(s.substring(start, i))){
                if(canBreak(s, wordSet, i, memo)) {
                    memo[start] = true;
                    return true;
        
                }
            }
        }
         memo[start] = false;
        return false;
    }
}