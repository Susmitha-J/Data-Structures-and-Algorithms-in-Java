class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();

        int open = n;
        int close = n;
        String op = "";
        generateparanthesis(open, close, op, list);
        return list;

    }

    public void generateparanthesis(int open, int close, String op, List<String> list) {
        if(open == 0 && close == 0) {
            list.add(op);
            return;
        }

        if(open != 0) {
            StringBuilder op2 = new StringBuilder(op);
            op2.append("(");
            generateparanthesis(open - 1, close, op2.toString(), list);
        }

        if(close > open) {
            StringBuilder op2 = new StringBuilder(op);
            op2.append(")");
            generateparanthesis(open, close-1, op2.toString(), list);
        }
        return;
    }
}