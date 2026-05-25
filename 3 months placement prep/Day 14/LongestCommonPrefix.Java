class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minlength = strs[0].length();
        for(int i =1;i<strs.length;i++) {
            minlength = Math.min(strs[i].length(), minlength);
        }
        
        
        for(int i = 0;i < minlength;i++) {
           char c = strs[0].charAt(i);
           for(int j=1;j<strs.length;j++) {
                if(strs[j].charAt(i) != c) {
                    return strs[0].substring(0,i);
                }
           }
        }

        return strs[0].substring(0,minlength);
    }
}