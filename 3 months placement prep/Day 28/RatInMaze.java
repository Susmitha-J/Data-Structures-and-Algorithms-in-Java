class Solution {
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        StringBuilder s = new StringBuilder("");
        ArrayList<String> list = new ArrayList<>();
        
        func(maze, s, list, 0,0, maze.length);
        return list;
        
        
    }
    
    public void func(int[][] maze, StringBuilder s, ArrayList<String> list,int row,int col, int n ) {
        
        
        if(row == 0 && col == 0 && maze[row][col] == 0) return;
        
        if(row == n-1 && col == n-1) {
            if(maze[row][col] != 0 && maze[row][col]!= 2) {
            list.add(s.toString());
            }
            return;
        }
        
        if(row < 0 || row >= n || col >= n  || col < 0 || maze[row][col] == 0 || maze[row][col] == 2) return;
            
        maze[row][col] = 2;
        
        s.append("D");
        func(maze, s, list, row+1, col,n);
        s.deleteCharAt(s.length() - 1);
        
        s.append("L");
        func(maze, s, list, row, col-1,n);
       s.deleteCharAt(s.length() - 1);
        
        s.append("R");
        func(maze, s, list, row, col+1,n);
        s.deleteCharAt(s.length() - 1);
        
        s.append("U");
        func(maze, s, list, row-1, col,n);
        s.deleteCharAt(s.length() - 1);
        
        maze[row][col] = 1;
        
        return;
        
        
    }
}