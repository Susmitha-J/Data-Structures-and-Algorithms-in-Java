enum Operator {
    MULTIPLY("*"),
    DIVIDE("/"),
    ADD("+"),
    SUBSTRACT("-");

    private final String symbol;

    Operator(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}

class Solution {
    public int evalRPN(String[] tokens) {

        int[] stack = new int[tokens.length];
        int top = -1;

        for(int i=0;i< tokens.length;i++){
            if(isOperator(tokens[i])){
                int right = stack[top];
                top--;
                int left = stack[top];
                top--;
                int value = apply(tokens[i], left, right);
                stack[++top] = value;
            } else{
               stack[++top] = stringToNumber(tokens[i]);
            }
        }

        if(top >=0) return stack[top];
        
        return -1;
    }

    public int apply(String symbol, int a, int b) {
        switch (symbol) {
        case "*":
            return a * b;
        case "/":
            return a / b;
        case "+":
            return a + b;
        case "-":
            return a - b;
        default:
            throw new IllegalArgumentException("Invalid operator");
        }

    }

    public boolean isOperator(String s) {
        if (s == null) return false;

        for (Operator op : Operator.values()) {
            if (op.getSymbol().equals(s)) {
                return true;
            }
        }
        return false;
    }   

    public int stringToNumber(String s){
        int num = 0, sign = 1, i = 0;
        
        if (s.charAt(0) == '-') {
            sign = -1;
            i = 1;
        }

        for (; i < s.length(); i++) num = num * 10 + (s.charAt(i) - '0');
        
        return num * sign;

    }
}