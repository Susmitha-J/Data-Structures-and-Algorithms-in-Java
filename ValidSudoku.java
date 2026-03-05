class Solution {
    public boolean isValidSudoku(char[][] board) {
        int i = 0, j= 0; //i for rows, j for cols


        for(int k = 0;k<9;k++){


            
            //row traverse
            Map<Integer, Integer> rowVal = new HashMap<>();
            Map<Integer, Integer> colVal = new HashMap<>();
            Map<Integer, Integer> boxVal = new HashMap<>();
            for(i=0;i<9;i++) {
                if(board[k][i] == '.') continue;
                else{
                    Integer num =  Integer.parseInt(String.valueOf(board[k][i]));
                    if(rowVal.containsKey(num)) return false;
                    rowVal.put(num, 1);
                }
            }


            for(i=0;i<9;i++) {
                if(board[i][k] == '.') continue;
                else{
                     Integer num =  Integer.parseInt(String.valueOf(board[i][k]));
                    if(colVal.containsKey(num)) return false;
                    colVal.put(num, 1);
                }
            }


            int startRow = (k / 3) * 3;
            int startCol = (k % 3) * 3;

            for(int r = startRow; r < startRow + 3; r++) {
                for(int c = startCol; c < startCol + 3; c++) {
                    if(board[r][c] != '.') {
                        int num = board[r][c] - '0';
                        if(boxVal.containsKey(num)) return false;
                        boxVal.put(num, 1);
                    }
                }
            }

        }

         return true;

    }
}