class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ops = new ArrayList<>();

        int[] stack = new int[target.length];
        int tpointer = 0, npointer = 1, top = -1;
        while(tpointer < target.length && npointer <= n) {
            stack[++top] = npointer;
            npointer++;
            ops.add("Push");
            if(stack[top] != target[tpointer]){
                 top--;
                 ops.add("Pop");
            }
            else tpointer++;


        }

        return ops;
    }
}