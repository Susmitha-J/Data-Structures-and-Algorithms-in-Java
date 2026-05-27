class Solution {
    public String reverseWords(String s) {
        StringBuilder currword = new StringBuilder();
        Stack<String> stack = new Stack<>();

        char arr[] = s.toCharArray();

        for(int i=0;i< arr.length;i++) {
            char ch = arr[i];

            if(!Character.isWhitespace(ch)) currword.append(ch);

            if((Character.isWhitespace(ch) || i == arr.length-1) && !currword.isEmpty()) {
                stack.push(currword.toString());
                currword.setLength(0);
            }
        }

        StringBuilder reverseSb = new StringBuilder();

        while (!stack.isEmpty()) {
            reverseSb.append(stack.pop()).append(" ");
        }

        return reverseSb.toString().strip();
    }
}