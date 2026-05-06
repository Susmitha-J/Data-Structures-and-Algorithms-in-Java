class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0])); 
        List<List<Integer>> minIntervals = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int i=1;i<intervals.length;i++) {
            if(intervals[i][0] <= end) {
                if(end < intervals[i][1]) {
                        end = intervals[i][1];
                }
             
            }else if(intervals[i][0] > end) {
                minIntervals.add(new ArrayList<>(Arrays.asList(start, end)));
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
         
         minIntervals.add(new ArrayList<>(Arrays.asList(start, end)));

         int[][] twoDArray = minIntervals.stream() // Stream<List<Integer>>
            .map(list -> list.stream().mapToInt(i -> i).toArray()) // Stream<int[]>
            .toArray(int[][]::new);

        return twoDArray;

    }
}