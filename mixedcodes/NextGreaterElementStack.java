class Solution {
    public int[] nextLargerElement(int[] arr) {
        int len = arr.length;
        int[] monostack = new int[len];
        int top = -1;

        int ans[] = new int[len];
        ans[len-1] = -1;
        monostack[++top] = arr[len-1];

        for(int i= len-2;i>=0;i--) {

            while(top >= 0 && monostack[top] <= arr[i]) --top;

            if(top == -1) ans[i] = -1;
            else ans[i] = monostack[top];

            monostack[++top] = arr[i];
        }

        return ans;
    
    }
}