class Solution {
    public int[][] transpose(int[][] A)
    {
        for(int i = 0; i < A.length; i++)
        {
            for(int j = 0; j < A[i].length; j++)
            {
                if(i != j && i < j)
                {
                    A[i][j] = A[j][i];
                }
            }
        }

        return A;

    }
}
