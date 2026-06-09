class Solution {
    public static String infixToPostfix(String s) {
        // stack 
        char stack[] = new char[s.length()];
        int top = -1;
        StringBuilder postfix = new StringBuilder();
        //traversing characters one by one
        for(int i = 0; i < s.length();i++) {
            char c = s.charAt(i);
            
            if(c == ' ') continue;
            
            if(c == '(') {
                stack[++top] = c;
                continue;
            }
            
            if(Character.isLetterOrDigit(c)) {
                postfix.append(c);
                continue;
            }
            
            if(c == ')') {
                while(top>=0 && stack[top] != '(') {
                    postfix.append(stack[top]);
                    top--;
                }
                
                top--;
                continue;
            }
            
            int currPrecedence =  precedence(c);
            
            while(top >= 0  && stack[top] != '(' &&
              (precedence(stack[top]) > currPrecedence ||
              (precedence(stack[top]) == currPrecedence && c != '^')) ){
                  
                postfix.append(stack[top]);
                top--;
                
            } 
            
            stack[++top] = c;

        }
        
        while(top >= 0) {
            postfix.append(stack[top]);
            top--;
        }
        return postfix.toString();
    }
    
    public static int precedence(char c) {
        switch(c) {
            case '+', '-':
                return 1;
            case '*', '/':
                return 2;
            case '^':
                return 3;
            default:
                return 0;
        }
    }
}