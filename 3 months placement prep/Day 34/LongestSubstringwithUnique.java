class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int left = 0, right;

        for(right = 0;right<s.length();right++) {
            char ch = s.charAt(right);
            if(map.containsKey(ch)) {
               int idx = map.get(ch);
                left =  Math.max(left, idx + 1);
            }
            
            map.put(ch, right);
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}