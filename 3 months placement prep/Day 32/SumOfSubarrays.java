class Solution {
    public int sumSubarrayMins(int[] arr) {
        long mod = 1_000_000_007L;
        long total = 0;
        int pse[] = getPSE(arr);
        int nse[] = getNSE(arr);
        for(int i=0;i<arr.length;i++) {
            long left =  i - pse[i];
            long right =  nse[i] - i;
            total =  (total + arr[i] * left * right ) % mod;
        }

        return (int) total;
    }

    public int[] getPSE(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] pse = new int[arr.length];
        for(int i=0;i<arr.length;i++) {
            while(!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }

            pse[i] = stack.isEmpty()? -1: stack.peek();
            
            stack.push(i);
        }

        return pse;
            
    }


     public int[] getNSE(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] nse = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--) {
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            nse[i] = stack.isEmpty()? arr.length: stack.peek();
            stack.push(i);
        }
        return nse;    
    }
}