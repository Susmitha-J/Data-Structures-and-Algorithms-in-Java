class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int min = bloomDay[0], max = bloomDay[0];

        //find min and max bloom day - O(N)

        for(int i=1;i<bloomDay.length;i++){ 
            min = Math.min(bloomDay[i], min);
            max = Math.max(bloomDay[i], max); 
        }

        // BINARY SEARCH FROM MIN DAY TO MAX DAY to get min day
        int minday = -1;
        while(min <= max) {
            int mid = (min + max) / 2;

            if(bloom(mid, bloomDay, k) >= m) { 
                minday = mid;
                max = mid-1;
            } else {
                min = mid+1;
            }
        
        }

        return minday;

    }

    public int bloom(int day, int bloomDay[], int k ) {
            int bloomcount = 0, m = 0;
            for(int i=0;i< bloomDay.length;i++) {
                if(bloomDay[i] <= day) {
                    bloomcount += 1;
                } else {
                    m += bloomcount / k;
                    bloomcount = 0;
                }
            }

             m += bloomcount / k;

            return m;
    }
}