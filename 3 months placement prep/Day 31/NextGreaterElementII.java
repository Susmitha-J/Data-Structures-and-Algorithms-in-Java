class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] nge = new int[nums.length];

        Stack<Integer> stack = new Stack<>();

        for(int i = nge.length*2-1; i>= 0;i--) {
            while(!stack.isEmpty() && nums[stack.peek()] <= nums[i%n]){
                stack.pop();
            }

            int nge2 = (stack.isEmpty())? -1: nums[stack.peek()];

            nge[i%n] = nge2;

            stack.push(i%n);
        }

        return nge;
    }
}