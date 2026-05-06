class Solution {
    int length;
    public int largestRectangleArea(int[] heights) {
        length = heights.length;
        int increasingStack[] = new int[length];
        int top = -1, maxArea = 0, i;
        
        for( i=0;i<length;i++) {
            while(top>=0 && heights[increasingStack[top]] >= heights[i]) {
                int curr = increasingStack[top];
                top--;
                int nse = i, pse = (top < 0)? -1: increasingStack[top];
                maxArea = Math.max(maxArea, heights[curr] * (nse - pse - 1));
            }

            increasingStack[++top] = i;
        }

         while(top>=0) {
                int curr = increasingStack[top];
                top--;
                int nse = i, pse = (top < 0)? -1: increasingStack[top];
                maxArea = Math.max(maxArea, heights[curr] * (nse - pse - 1));
            }

            return maxArea;
        
    }
}