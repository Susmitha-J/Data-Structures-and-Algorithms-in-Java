class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> partitions = new ArrayList<>();
        List<String> curr = new ArrayList<>();
        backtrack(s, 0, curr, partitions);
        return partitions;
    }

    public void backtrack(String s, int idx, List<String> curr,  List<List<String>> partitions) {
        if(idx == s.length()) {
            partitions.add(new ArrayList(curr));
            return;
        }

        //check for the right index to partition
        for(int i= idx;i<s.length();i++) {
            if(isPalindrome(s,idx, i)) {
                curr.add(s.substring(idx, i+1));
                backtrack(s, i+1, curr, partitions);
                curr.remove(curr.size()-1);
            }
        }

        return; 
    }

    public boolean isPalindrome(String s, int left, int right) {
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}