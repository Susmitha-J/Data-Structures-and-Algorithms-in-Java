// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int max = 0, n = arr.length, sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        // using prefix sum and hashmap
        for(int i=0;i<n;i++) {
           
            sum += arr[i];
            
            if(sum == k) max = Math.max( max, i+1); 
            else if (map.containsKey(sum - k)) {
                max = Math.max(max, i - map.get(sum-k));
            }
            
            if(!map.containsKey(sum)) map.put(sum, i);
            
        }
        
        return max;
        
        
    }
    
    public int longestsubarraybrute(int[] arr, int k) {
        int max = 0, sum = 0, n = arr.length;
        int i,j;
        
        for(i=0;i<n;i++){
            for(j=i;j<n;j++){
                sum += arr[j];
                if(sum == k) {
                    max = Math.max((j-i) + 1, max);
                }
            }
            sum = 0;
        }
        
        return max;
    }
}
