class Solution {
    public boolean isValid(String s) {

        char arr[] = new char[s.length()];
        int top = -1;
        for(char c : s.toCharArray()){
            if(c == '(' || c == '[' || c =='{') arr[++top] = c;
            else{
                if(top >=0 && istopvalidParanthesis(c) == arr[top]){
                    top--;
                } else {
                    return false;
                }
               
            }
        }
        if(top>=0) return false;

        return true;
        
    }

    public char istopvalidParanthesis(char c) {
        switch(c) {
            case ']':
                return '[';
            case ')':
                return '(';
            case '}':
                return '{';
            default:
                return ' ';
        }
    }
}