class Solution {
    public int maxDepth(String s) {
        int count = 0, maxCount = 0;
        for(int i =0;i < s.length();i++) {
            if(s.charAt(i) == '(') {
                count++;
                maxCount = Math.max(count, maxCount);
            } else if(s.charAt(i) == ')') {
                count--;
            }
        }

        return maxCount;
    }
}