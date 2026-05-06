class SubSequence {
    public boolean isSubsequence(String s, String t) {
        int pointer1=0, pointer2=0;
        int length = t.length();
        while(pointer2<length && pointer1 < s.length()){
           if (s.charAt(pointer1)==t.charAt(pointer2)){
                pointer1++;
                pointer2++;
            }else {
                pointer2++;
            }
        }
        if(pointer1>=s.length()){
            return true;
        } else {
            return false;
        }      
    }
}