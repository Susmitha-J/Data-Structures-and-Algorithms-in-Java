class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        // sort the arrays - o(nlogn)
        Arrays.sort(stalls);
        
        int max = stalls[0];
        for(int i=1;i<stalls.length;i++) {
            max = Math.max(stalls[i], max);
        }
        
        int min = 1;
        int dist = 1;
        while(min <= max) {
            int mid = (min + max)/2;
            
            if(countcows(stalls, k, mid) < k){
                max = mid - 1;
            } else{
                dist = mid;
                min = mid+1;
            }
        }
        
        return dist;
        
    }
    
    public int countcows(int stalls[], int k, int dist) {
        int cowsCount = 1;
        int prev = stalls[0];
        for(int i = 1;i< stalls.length;i++){
            if(stalls[i] - prev >= dist) {
                cowsCount++;
                prev = stalls[i];
            }
        }
        
        return cowsCount;
    }
}