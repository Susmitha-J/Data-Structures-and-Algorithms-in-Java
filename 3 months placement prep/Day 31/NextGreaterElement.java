class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int i= nums2.length-1;i>=0;i--) {
            
             while(!stack.isEmpty() && nums2[stack.peek()] <= nums2[i]) {
                stack.pop();
             }

             int nge = stack.isEmpty()? -1 :  nums2[stack.peek()];
          
             map.put(nums2[i], nge);
        
             stack.push(i);
        }

        int n = nums1.length;

        for(int i =0;i<n;i++) {
           nums1[i] =  map.get(nums1[i]);
        }
        return nums1;
    }
}