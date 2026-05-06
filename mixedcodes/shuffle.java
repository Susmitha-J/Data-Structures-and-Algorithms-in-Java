class Solution {
    public int[] shuffle(int[] nums, int n) {
        int pairs[] = new int[n*2];
        int x=0, y=n;
        for(int i=0;i<2*n;i=i+2){
            pairs[i] = nums[x];
            pairs[i+1] = nums[y];
            x++;
            y++;
        } 
        return pairs;
        
    }
}