class Solution {
    
    
    public String infixToPrefix(String s) {
        // code here
        String rev = reverse(s);
        
        String postFix = Postfix(rev);
        
        String prefix = reverse(postFix);
        
        return prefix;
        
        
    }
    
    public String Postfix(String s) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i< s.length();i++) {
            char c = s.charAt(i);
            if(c == ' ') continue;
            
            if(c == '(') {
                stack.push(c);
                continue;
            }
            
            if(Character.isLetterOrDigit(c)) {
                postfix.append(c);
                continue;
            }
            
            if(c == ')') {
                while(!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                    
                }
                
                stack.pop();
                continue;
            }
            
            while(!stack.isEmpty() && stack.peek() != '(' && 
            (precedence(stack.peek()) > precedence(c) || 
            (precedence(stack.peek()) == precedence(c) && c == '^'))) {
                postfix.append(stack.pop());
            }
            
            stack.push(c);
        }
        
        while(!stack.isEmpty()) {
            postfix.append(stack.pop());
        }
        
        return postfix.toString();
    }
    
    public int precedence(char c) {
        switch(c) {
            case '+', '-': 
                return 1;
            case '/', '*':
                return 2;
            case '^':
                return 3;
            default:
                return 0;
        }
    }
    
    public String reverse(String s) {
        char arr[] = new char[s.length()];
        int idx = 0;
        for(int i =s.length()-1;i>=0;i--) {
            if(s.charAt(i) == '(') {
                arr[idx++] = ')';
            } else if(s.charAt(i) == ')') {
                arr[idx++] = '(';
            }else{
                arr[idx++] = s.charAt(i);
            }
        }

       return String.valueOf(arr); 
  
    }
}