class Solution {
    public int numberOfSubstrings(String s) {
        int map[] = new int[3];
        int left = 0, right = 0;
        int count = 0;
        while(right < s.length()) {
            map[s.charAt(right) - 'a']++;

            while(map[0] > 0 && map[1] > 0 && map[2] > 0)  {
                count += s.length() - right;
                map[s.charAt(left) - 'a']--;
                left++;
            }
    
            right++;
        }

        return count;
    }
}