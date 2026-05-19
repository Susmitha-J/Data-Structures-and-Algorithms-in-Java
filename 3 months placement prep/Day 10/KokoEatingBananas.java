class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int min, max;
        min = 1;
        max = piles[0];
        for(int i =1;i< piles.length; i++) {
            max = Math.max(piles[i], max);
        }

        //here we consider min < max unlike min <= max because we are updating min = mid + 1 and max = mid, so when min == max, we have found the answer
        while(min < max) {
            int mid = min + (max-min)/2;
            int eattime = getTime(piles, mid);
            if(eattime <= h) { 
                max = mid;
            } else{
                min = mid+1;
            }
        }
        return min;
    }

    public int getTime(int piles[], int speed) {
        int totalTime = 0;
        for(int i=0;i<piles.length;i++) {
            totalTime += (piles[i] + speed - 1) / speed;
        }

        return totalTime;
    }
}