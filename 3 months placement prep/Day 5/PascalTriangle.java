class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        //basecase row 0
        triangle.add(List.of(1));

        for(int row = 1;row < numRows;row++) {
            List<Integer> currRow = new ArrayList<>();
            currRow.add(1);
            List<Integer> prevRow = triangle.get(row-1);
            for(int col = 1;col<prevRow.size();col++) {
                int sum = prevRow.get(col-1) + prevRow.get(col);
                currRow.add(sum);
            }
            currRow.add(1);
            triangle.add(currRow);
        }

        return triangle;
    }
}