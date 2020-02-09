class Solution {
    public int numIslands(char[][] grid)
    {
        int count = 0;
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[i].length; j++)
            {
                if(grid[i][j] == '1')
                {
                    count += 1; //adds one because atleast one island
                    //breath first search
                    callBFS(grid,i,j);
                }
            }
        }
        return count;
    }

    private void callBFS(char[][] grid, int i, int j)
    {
        //border checks and water checks
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0')
        {
            return;
        }
        //sets the 1 ur at to 0 to prevent duplicate islands/extra counting
        grid[i][j] = '0';
        callBFS(grid,i+1,j); //up
        callBFS(grid,i-1,j); //down
        callBFS(grid,i,j-1); //left
        callBFS(grid,i,j+1); //right
    }
}
