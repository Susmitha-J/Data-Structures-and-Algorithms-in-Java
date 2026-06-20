class Solution {
    public int characterReplacement(String s, int k) {
        int map[] = new int[26];
        int left = 0, right = 0;
        int maxFreq = 0;
        int max = 0;

        while(right < s.length()) {
           int  ch = s.charAt(right) - 'A';

           map[ch]++;
           maxFreq = Math.max(maxFreq, map[ch]);

           while((right - left + 1) - maxFreq > k){
                map[s.charAt(left) - 'A']--;
                left++;
           }

           max = Math.max(max, right - left +1 );
            right++;
        }

        return max;
    }
}