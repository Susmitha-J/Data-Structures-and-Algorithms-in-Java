class Solution {
    int maxLength(int arr[]) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0, sum = 0;
        for(int i=0;i<arr.length;i++) {
            sum = sum + arr[i];
            if(sum == 0) max = i+1;
            if(map.containsKey(sum)) {
                max = Math.max(max, i - map.get(sum));
            } else map.put(sum, i);
        }
        
        return max;
    }
}