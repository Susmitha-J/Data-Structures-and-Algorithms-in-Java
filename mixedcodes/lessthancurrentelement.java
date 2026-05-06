class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // //Mapping Approach buckets - o(nlogn) + n + n + n
        // int map[] = new int[101];
        // Arrays.fill(map,-1);

        // //copy nums to sorted and sort
        // int sorted[] = nums.clone();
        // Arrays.sort(sorted);
        

        // //mapping buckets with position 
        // for(int i=0;i<sorted.length;i++) {
        //     if(map[sorted[i]] == -1 ) map[sorted[i]] = i;
        //     else continue; 

        // }

        // for(int i=0;i<nums.length;i++) {
        //     nums[i] = map[nums[i]];
        // }

        // return nums;

        //Prefix Sum approach

        int map[] = new int[101];

        //frequency of each element
        for(int i=0;i<nums.length;i++) {
            map[nums[i]]++;
        }

        for(int i=1;i<101;i++) {
            map[i] += map[i-1];
        }

        for(int i=0;i<nums.length;i++) {
            nums[i] = (nums[i]==0) ? 0 : map[nums[i] - 1];
        }

        return nums;



    }
}