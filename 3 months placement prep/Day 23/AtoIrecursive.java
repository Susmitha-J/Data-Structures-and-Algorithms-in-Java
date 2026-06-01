class Solution {
    public int myAtoi(String s) {
        // code here
        if(s.isEmpty()) return 0;
        
        return myAtoI(s, 0, 1, 0, false, false);
        
    }
    
    public int myAtoI(String s, int idx, int sign, int result, boolean started, boolean signUsed) {
        if(idx == s.length()) return result * sign;
        
        char ch = s.charAt(idx);
        
        //white space
        if (!started && ch == ' ') {
            return myAtoI(s, idx + 1, sign, result, false, false);
        }
    
        // 2. Handle signs
        if (!started && !signUsed && ch == '-') {
            return myAtoI(s, idx + 1, -1, result, false, true);
        }
        
        if (!started && !signUsed && ch == '+') {
            return myAtoI(s, idx + 1, 1, result, false, true);
        } 
    
        if(Character.isDigit(ch)) {
             int digit = ch - '0';

                // overflow check BEFORE multiplying
                if (result > (Integer.MAX_VALUE - digit) / 10) {
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                result  = result * 10 + digit; 
                return myAtoI(s, idx + 1, sign, result, true, signUsed);
        } 
        
       return result * sign;
        
        
    }
}