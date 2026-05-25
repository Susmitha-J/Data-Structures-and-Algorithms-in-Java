class Solution {
    public int myAtoi(String s) {
        
       if (s == null) return 0;

        int i = 0, n = s.length();

        // 1. Skip spaces
        while (i < n && s.charAt(i) == ' ') i++;

        if (i == n) return 0;
        
        // 2. Sign
        int sign = 1;
        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }

        int value = 0;

        while(i < s.length() && Character.isDigit(s.charAt(i))) {
                int digit = s.charAt(i) - '0';

                // overflow check BEFORE multiplying
                if (value > (Integer.MAX_VALUE - digit) / 10) {
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                value = value * 10 + digit;
                i++;
        }
        return sign * value;
    }
}