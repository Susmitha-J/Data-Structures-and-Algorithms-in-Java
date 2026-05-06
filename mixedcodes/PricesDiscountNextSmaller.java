class Solution {
    public int[] finalPrices(int[] prices) {

        int length = prices.length;
        int[] answers = new int[length];
        int increasingStack[] = new int[length];
        int top = -1;

        answers[length-1] = prices[length-1];
        ++top;

        increasingStack[top] = prices[length-1];

        for(int i=length-2;i>=0;i--) {
            while(top >= 0 && increasingStack[top] > prices[i]) top--;

            if(top == -1) answers[i] = prices[i];
            else answers[i] = prices[i] - increasingStack[top];

            ++top;
            increasingStack[top] = prices[i];
        }

        return answers;

        
    }
}