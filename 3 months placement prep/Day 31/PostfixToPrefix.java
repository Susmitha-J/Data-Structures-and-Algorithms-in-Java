class Solution {
    static String postToPre(String s) {
        // code here
        Stack<String> stack = new Stack<>();
        
        for(int i = 0;i< s.length();i++) {
            char c = s.charAt(i);
            
            if(c ==  ' ') continue;
            
            if(Character.isLetterOrDigit(c)) {
                stack.push(String.valueOf(c));
                
            } else {
                
                String right = stack.pop();
                String left = stack.pop();
                StringBuilder exp = new StringBuilder();
                
                exp.append(String.valueOf(c));
                exp.append(left);
                exp.append(right);
                
                stack.push(exp.toString());
                
            }
        }
        
        return stack.pop();
        
    }
}
