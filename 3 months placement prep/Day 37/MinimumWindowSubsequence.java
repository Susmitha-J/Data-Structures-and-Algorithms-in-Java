class Solution {
    public String minWindow(String s1, String s2) {
        // code here
        int s1p = 0, s2p = 0;
        int minLen = Integer.MAX_VALUE;
        int startIdx = -1;
        
        while(s1p < s1.length()) {
             s2p = 0;

            
            while (s1p < s1.length()) {
                if (s1.charAt(s1p) == s2.charAt(s2p)) {
                    s2p++;
                }
                if (s2p == s2.length()) {
                    break;
                }
                s1p++;
            }

            if (s1p == s1.length()) {
                break;
            }

            int end = s1p;
            
            s2p = s2.length() - 1;
            while (s2p >= 0) {
                if (s1.charAt(s1p) == s2.charAt(s2p)) {
                    s2p--;
                }
                s1p--;
            }
            
            int start = s1p + 1;
            if (end - start + 1 < minLen) {
                minLen = end - start + 1;
                startIdx = start;
            }
            
            s1p = start + 1;
        }

        return startIdx == -1
                ? ""
                : s1.substring(startIdx, startIdx + minLen);
            
        
    }
}
