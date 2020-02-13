class Solution {
    public int findCircleNum(int[][] M)
    {
        //size of the 2d array
        int[] visit = new int[M.length];
        int count = 0;
        for(int i = 0; i < M.length;i++)
        {
            if(visit[i] == 0)
            {
                dfs(M,visit,i);
                count++;
            }
        }
        return count;
    }

    public void dfs(int[][] M, int[] visit, int i)
    {
        for(int j = 0; j < M.length; j++)
        {
            //if location = 1 and we havent visited it yet
            if(M[i][j] == 1 && visit[j] == 0)
            {
                //we have visited it now
                visit[j] = 1;
                //add to dfs stack
                dfs(M, visit, j);
            }
        }
    }
}
