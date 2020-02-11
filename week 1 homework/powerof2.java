class Solution {
    public boolean isPowerOfTwo(int n)
    {
        if(n < 0)
        {return false;}
        if(n>0)
        {
            while(n % 2 == 0)
            {
                n /= 2;
            }
            if(n == 1)
            {
                return true;
            }
        }
        if(n == 0 || n != 1)
        {
            return false;
        }
        return false;
    }
}
