class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int totalSum = 0;
        int n = cardPoints.length;
        for(int i =0;i< n;i++) {
            totalSum += cardPoints[i];
        }

        int winSum = 0;
        for(int i=0;i<n - k;i++) {
            winSum += cardPoints[i];
        }

        int max = Math.max(0, totalSum - winSum);

        for(int i = n - k; i < n;i++) {
            winSum = winSum - cardPoints[i - (n - k)];
            winSum = winSum + cardPoints[i];
            max = Math.max(max, totalSum - winSum);
        }

        return max;
    }
}