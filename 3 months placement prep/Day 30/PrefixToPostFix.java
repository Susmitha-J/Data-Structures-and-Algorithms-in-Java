class Solution {
    static String preToPost(String s) {
        // code here
        Stack<String> stack = new Stack<>();
        for(int i = s.length() -1 ; i>= 0;i--) {
            char ch = s.charAt(i);
            if(ch == ' ') continue;
            
            if(Character.isLetterOrDigit(ch)) {
                stack.push(String.valueOf(ch));
                continue;
            } else {
                String left = stack.pop();
                String right = stack.pop();
                StringBuilder exp = new StringBuilder();
                exp.append(left);
                exp.append(right);
                exp.append(String.valueOf(ch));
                stack.push(exp.toString());
            }
        }
        
        return stack.pop();
        
        
    }
}