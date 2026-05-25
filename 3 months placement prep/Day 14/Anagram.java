class Solution {
    public boolean isAnagram(String s, String t) {
        int arrS[] = new int[256];

        for(int i =0;i< s.length();i++) {
            if(Character.isLetterOrDigit(s.charAt(i))){
                ++arrS[s.charAt(i)];
            }
        }

        for(int i=0;i<t.length();i++){
            Character ch = t.charAt(i);
            if(Character.isLetterOrDigit(t.charAt(i))) {
                --arrS[t.charAt(i)];

                if(arrS[t.charAt(i)] < 0) {
                    return false;
                }
            }
        }

        for(int i=0;i<s.length();i++) {
           if(Character.isLetterOrDigit(s.charAt(i))){
                if(arrS[s.charAt(i)] > 0) {
                    return false;
                }
            }
        }

        return true;
        
    }
}