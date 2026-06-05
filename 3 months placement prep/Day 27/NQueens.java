class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> boards = new ArrayList<>();
       char[][] board = new char[n][n];

        for (char[] row : board) {
            Arrays.fill(row, '.');
        }

        // HashSet<Integer> rowset = new HashSet<>();
        // HashSet<Integer> posDiag = new HashSet<>();
        // HashSet<Integer> negDiag = new HashSet<>();

        boolean[] rows = new boolean[n];
        boolean[] posDiag = new boolean[2 * n - 1];
        boolean[] negDiag = new boolean[2 * n - 1];

        nqueens(n, 0, board, boards,   rows,  posDiag,  negDiag);

        return boards;


    }

    public void nqueens(int n, int col,  char[][] board,  List<List<String>> boards,  boolean[] rows, boolean[] posDiag, boolean[] negDiag) {
        if(col == n) {
           List<String> current = new ArrayList<>();
            for (char[] r : board) {
                current.add(new String(r));
            }
            boards.add(current);
            return;
        }

        for(int row = 0; row < n ;row++) {

            int pd = row + col;           
            int nd = row - col + n - 1;
            if(!rows[row] && !posDiag[pd] && !negDiag[nd]) {
            board[row][col] = 'Q';
            rows[row] = true;
            posDiag[pd] = true;
            negDiag[nd] = true;

            nqueens(n, col+1, board, boards, rows, posDiag, negDiag);

            board[row][col] = '.';
            rows[row] = false;
            posDiag[pd] = false;
            negDiag[nd] = false;
            } 

        }

        return;
    }
}