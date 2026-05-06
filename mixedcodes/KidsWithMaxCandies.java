class KidsWithMaxCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int i;
        List<Boolean> isMaxCandies = new ArrayList<Boolean>();
        int maxCandies = getMaxOfCandies(candies);
        for(i=0;i<candies.length;i++) {

            isMaxCandies.add(candies[i]+extraCandies >= maxCandies ? true : false);
        } 
        return isMaxCandies;
    }

    public int getMaxOfCandies(int[] candies) {
        int i=0;
        int max = Integer.MIN_VALUE;
        for(i=0;i<candies.length;i++) {
            if(candies[i]> max) {
                max = candies[i];
            }
        }
        return max;
    }
}