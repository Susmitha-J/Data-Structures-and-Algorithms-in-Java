// User function Template for Java

class Solution {
    static String postToInfix(String exp) {
        // code here
        Stack<String> stack = new Stack<>();
        
        for(int i = 0;i< exp.length();i++) {
            char c = exp.charAt(i);
            
            if(c ==' ') continue;
            
            if(Character.isLetterOrDigit(c)) {
                stack.push(String.valueOf(c));
            }else{
                String right = stack.pop();
                String left = stack.pop();
                StringBuilder exp1 = new StringBuilder();
                exp1.append("(");
                exp1.append(left);
                exp1.append(String.valueOf(c));
                exp1.append(right);
                exp1.append(")");
                
                stack.push(exp1.toString());
            }
            
        }
        
        return stack.pop();
    }
}
