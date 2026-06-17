class Solution {
    public long subArrayRanges(int[] nums) {
        long mintotal = 0;


        int pse[] = getPSE(nums);
        int nse[] = getNSE(nums);
        for(int i=0;i<nums.length;i++) {
            long left =  i - pse[i];
            long right =  nse[i] - i;
            mintotal =  (long) mintotal + nums[i] * left * right;
        }

        long maxtotal = 0;

         int pge[] = getPGE(nums);
        int nge[] = getNGE(nums);
        for(int i=0;i<nums.length;i++) {
            long left =  i - pge[i];
            long right =  nge[i] - i;
            maxtotal =  (long) maxtotal + nums[i] * left * right ;
        }

        return maxtotal - mintotal;




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

    public int[] getPGE(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] pge = new int[arr.length];
        for(int i=0;i<arr.length;i++) {
            while(!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                stack.pop();
            }

            pge[i] = stack.isEmpty()? -1: stack.peek();
            
            stack.push(i);
        }

        return pge;
            
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

    public int[] getNGE(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] nge = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--) {
            while(!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            nge[i] = stack.isEmpty()? arr.length: stack.peek();
            stack.push(i);
        }
        return nge;    
    }
}