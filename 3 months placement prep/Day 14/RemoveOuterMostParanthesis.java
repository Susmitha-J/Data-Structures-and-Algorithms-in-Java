class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        String ans = "";
        for(int i=0;i<s.length();i++) {
           if(s.charAt(i) == ')') stack.pop();
           if(stack.size() != 0) ans += s.charAt(i);
        if(s.charAt(i) == '(') stack.push(s.charAt(i));
        }

        return ans;
    }
}