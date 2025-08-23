class Solution {
    public int minimumArea(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int minrow = n, mincol = m, maxrow = 0, maxcol = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    minrow = Math.min(minrow, i);
                    mincol = Math.min(mincol, j);
                    maxrow = Math.max(maxrow, i);
                    maxcol = Math.max(maxcol, j);
                   
                }
            }
        }
        return((maxrow-minrow+1)*(maxcol-mincol+1));
    }
}