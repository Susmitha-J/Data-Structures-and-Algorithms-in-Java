class Solution {
    public int trap(int[] height) {
        Stack<Integer> stack = new Stack<>();

        int trappingwater = 0;

        for(int i = 0;i < height.length;i++) {
            while(!stack.isEmpty() && height[stack.peek()] < height[i]) {
                int bottom = height[stack.pop()];
                
                if(stack.isEmpty()) continue;

                int leftWall = height[stack.peek()];
                int dist = i - stack.peek() - 1; 
                int rightWall = height[i];

                trappingwater += (Math.min(leftWall, rightWall) - bottom) * dist;
            }

            stack.push(i);
        }

        return trappingwater;
        
    }
}