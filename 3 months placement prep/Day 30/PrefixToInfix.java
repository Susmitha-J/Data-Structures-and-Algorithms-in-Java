// User function Template for Java

class Solution {
    static String preToInfix(String pre_exp) {
        // code here
        Stack<String> stack = new Stack<>();
        
        for(int i = pre_exp.length()-1;i>=0;i--) {
            char ch = pre_exp.charAt(i);
            
            if(ch == ' ') continue;
            
            if(Character.isLetterOrDigit(ch)) {
               stack.push(String.valueOf(ch));
            } else{
                String left = stack.pop();
                String right = stack.pop();
                
                StringBuilder exp = new StringBuilder();
                exp.append('(');
                exp.append(left);
                exp.append(ch);
                exp.append(right);
                exp.append(')');
                
                stack.push(exp.toString());
            }
            
            
        }
        
        return stack.pop();
    }
}
