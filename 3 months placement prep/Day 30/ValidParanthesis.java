class Solution {
    public boolean isValid(String s) {
        char stack[] = new char[s.length()];
        int top = -1;
        for(char c : s.toCharArray()) {
            if(c == '{' || c == '(' || c == '['){
                stack[++top] = c;
            } else{
                if(top < 0 || stack[top] != match(c) ) return false;
                
                top--;
            }
        } 

        return top < 0;
    }

    public char match(char c) {
        switch(c) {
            case '}':
                return '{';
            case ']':
                return '[';
            case ')':
                return '(';
            default:
                return ' ';
        }
    }

}