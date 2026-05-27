class Solution {
    public int kDistinctChar(String s, int k) {
       int maxlen = 0, left = 0, right = 0;
       HashMap<Character, Integer> map = new HashMap<>();
       
       while(right < s.length()){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0)+1);

            if(map.size() > k) {

                while(map.size() > k && left < s.length()) {
                        map.put(s.charAt(left), map.get(s.charAt(left))-1);
                        if(map.get(s.charAt(left)) == 0) map.remove(s.charAt(left));
                        left++;
                }

            }
            maxlen = Math.max(right - left + 1, maxlen);
            right++;
            
       }
       return maxlen;
    }
}