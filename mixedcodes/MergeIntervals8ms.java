class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0])); 
        List<int[]> minIntervals = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int i=1;i<intervals.length;i++) {
            if(intervals[i][0] <= end) {
                if(end < intervals[i][1]) {
                        end = intervals[i][1];
                }
             
            }else if(intervals[i][0] > end) {
                int arr[] = {start, end};
                minIntervals.add(arr);
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
         
        int arr[] = {start, end};
        minIntervals.add(arr);

        return minIntervals.toArray(int[][]::new);

    }
}