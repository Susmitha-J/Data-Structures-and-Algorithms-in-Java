class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int length = temperatures.length;

        int answers[] = new int[length];
        int indexStack[] = new int[length];
        int top = -1;

        for(int i=length-1;i>=0;i--) {

           while(top >= 0 && temperatures[indexStack[top]] <= temperatures[i]) top--;

           if(top == -1) answers[i] = 0;
           else answers[i] = indexStack[top] - i;
            
            indexStack[++top] = i;
        }

        return answers;
    }
}