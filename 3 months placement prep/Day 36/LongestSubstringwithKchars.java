class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int max = -1;
        int left = 0, right = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        
        while(right < s.length()) {
            char rightch = s.charAt(right);
            map.put(rightch, map.getOrDefault(rightch, 0)+1);
            
            while(map.size() > k) {
                char leftch = s.charAt(left);
                map.put(leftch, map.get(leftch)-1);
                if(map.get(leftch) == 0) map.remove(leftch);
                
                left++;
            }
            
            if(map.size() == k)  max = Math.max(right - left+1, max);
            
            right++;
           
            
        }
        
        return max;
    }
}