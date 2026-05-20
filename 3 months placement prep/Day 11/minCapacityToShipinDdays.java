class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = weights[0], sum = weights[0];
        // max of element is left of range and sum is right of the range
        for(int i=1;i<weights.length;i++) {
            max = Math.max(max, weights[i]);
            sum += weights[i];
        }

        int left = max, right = sum; //range of capacities
        int capacity = sum; //min capacity
        while(left <= right) {
            int mid = (left + right)/2;

            if(loadDaysWithCapacity(mid, weights) <= days){
                capacity = mid;
                right = mid-1;
            } else {
                left = mid+1;
            }
        }

        return capacity;
    }

    public int loadDaysWithCapacity(int capacity, int weights[]) {
        int days = 0;
        int load = 0;
        for(int i=0;i< weights.length;i++) {
            if(load + weights[i] > capacity) {
                days++;
                load = weights[i];
            } else {
                load += weights[i];
            }
        }
        //for the last elements case
        days++;
        return days;
    }
}