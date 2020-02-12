class Solution {
    public int[] sortArrayByParity(int[] A)
    {
        int[] holder = new int[A.length];
        int nplace = 0;
        for(int i = 0; i < A.length; i++)
        {
            if(A[i] % 2 == 0)
            {
                holder[nplace] = A[i];
                nplace++;
            }
        }
        for(int i = 0; i < A.length; i++)
        {
            if(A[i] % 2 == 1)
            {
                holder[nplace] = A[i];
                nplace++;
            }
        }
        return holder;

    }
}
