class Solution {
    boolean graphColoring(int v, int[][] edges, int m) {
        // code here
        int[] color = new int[v];
        return recurse(v, edges, m, 0, color);
        
    }
    
    public boolean isSafe(int node, int v, int[][] edges, int m , int[] color, int colorcurr) {
        for(int i=0;i<edges.length;i++) {
            if(edges[i][0] == node && color[edges[i][1]] == colorcurr) return false;
            if(edges[i][1] == node && color[edges[i][0]] == colorcurr) return false;
        }
        
        return true;
    }
    
    public boolean recurse(int v, int[][] edges,  int m, int node, int color[] )
    {
        if(node == v) return true;
        
        for(int i = 1;i<=m;i++) {
            if(isSafe(node, v, edges, m, color, i)) {
                color[node] = i;
                if(recurse(v, edges, m, node+1, color)) return true;
                color[node] = 0;
            }
        }
        
        return false;
    }
}