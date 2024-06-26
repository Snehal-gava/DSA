class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int[][] ans = new int[n-2][n-2];
        for(int i=0;i<n-2;i++){
            for(int j=0;j<n-2;j++){
                ans[i][j]=findMax(grid,i,j);
            }
        }
        return ans;
    }
    private int findMax(int[][] grid, int x, int y){
        int maxElement=0;
        for(int i=x;i<x+3;i++){
            for(int j=y;j<y+3;j++){
                maxElement=Math.max(maxElement,grid[i][j]);
            }
        }
        return maxElement;
    }
}