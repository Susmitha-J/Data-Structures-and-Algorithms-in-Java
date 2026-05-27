class Solution {
    public int countSubstr(String s, int k) {
       
       return atmostsubstr(s, k) - atmostsubstr(s, k-1);
    }
    
    public int atmostsubstr(String s, int k) {
         //  code here
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        
        int left = 0, right = 0;
        while(right < s.length()) {
            char rightch = s.charAt(right);
            map.put(rightch, map.getOrDefault(rightch, 0) +1);
            
            while(map.size() > k) {
                
                char leftch = s.charAt(left);
                
                map.put(leftch, map.get(leftch)-1);
                
                if(map.get(leftch) == 0) map.remove(leftch);
                
                left++;

            }
            
            count += right - left + 1;
            right++;
        }
        
        return count;
    }
}