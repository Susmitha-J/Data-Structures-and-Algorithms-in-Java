class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i = 0;i< board.length;i++) {
            for(int j = 0;j< board[0].length;j++) {
               boolean val =  dfs(board, word,0, i, j);
               if(val) return val;
            }
        }

        return false;
    }

    public boolean dfs(char[][] board, String word, int wordIdx, int i, int j) {
        if(wordIdx == word.length()) return true;

        if(i<0 || i >= board.length || j<0 || j>= board[0].length || board[i][j] != word.charAt(wordIdx)) return false;

        char temp = board[i][j];
        board[i][j] = '#';
        boolean found = dfs(board, word, wordIdx + 1, i-1,j) || //up 
                         dfs(board, word, wordIdx + 1, i+1,j) || //down
                         dfs(board, word, wordIdx + 1, i,j+1) || //left
                         dfs(board, word, wordIdx + 1, i,j-1); //right
        board[i][j] = temp;
        return found;

    }
}