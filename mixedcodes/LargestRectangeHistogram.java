class Solution {
    int length;
    public int largestRectangleArea(int[] heights) {
        length = heights.length;
        int nse[] = nextSmallestElement(heights);
        int pse[] = previousSmallestElement(heights);
        int maxArea = 0;
        for(int i=0;i<length;i++) {
            maxArea = Math.max(maxArea, heights[i] * (nse[i] - pse[i] - 1));
        }

        return maxArea;
        
    }

    public int[] nextSmallestElement(int[] heights) {
        int[] incstack = new int[length];
        int ans[] = new int[length];
        int top = -1;

        for(int i=length-1;i>=0;i--){
            while(top>=0 && heights[incstack[top]] >= heights[i]) top--;

            if(top == -1) ans[i] = length;
            else{
                ans[i] = incstack[top]; 
            }

            incstack[++top] = i;
        }

        return ans;
     }

     public int[] previousSmallestElement(int[] heights) {
        int[] incstack = new int[length];
        int[] ans = new int[length];
        int top = -1;

        for(int i=0;i<length;i++) {
            while(top >=0 && heights[incstack[top]] >= heights[i]) top--;

            if(top == -1) ans[i] = -1;
            else{
                ans[i] = incstack[top]; 
            }

            incstack[++top] = i;

        }

        return ans;
     }
}