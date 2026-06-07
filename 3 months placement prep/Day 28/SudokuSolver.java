class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
        return;
    }

    public boolean canPlace(char[][] board, int row, int col, char c) {
        for(int i=0;i<9;i++) {
            //if  digit found in  row 
            if(board[row][i] == c) return false;

            //if digit found in col
            if(board[i][col] == c) return false;

            //if digit found in box
            if(board[3 * (row/3) + i/3][3 * (col/3)+ i%3] == c) return false;
        }

        return true;
    }

    public boolean solve(char[][] board) {
        for(int row = 0;row<9;row++) {
            for(int col = 0;col<9;col++) {
                //find the  next empty cell
                if(board[row][col] == '.') {
                    for (char c = '1'; c <= '9'; c++) {
                       if(canPlace(board, row, col, c)) {
                           board[row][col] = c;
                           if(solve(board)) return true;
                           else board[row][col] = '.';
                       }
                    }
                    return false;
                }
            }
        }
        return true;
    }
}