class Solution {
    public int candy(int[] ratings) {
        int c[] = new int[ratings.length];

        for(int i=0;i<ratings.length;i++) {
            c[i] = 1;
        }

        for(int i=1;i<ratings.length;i++) {
            if(ratings[i] > ratings[i-1]) {
                c[i] = c[i-1] + 1;
            }
        }

        for(int i=ratings.length-2;i>=0;i--) {
            if(ratings[i] > ratings[i+1]) {
                c[i] = Math.max(c[i+1] + 1, c[i]);
            }
        }
        int minCandies = 0;
        for(int i=0;i<ratings.length;i++) minCandies += c[i];

        return minCandies;

        
    }
}