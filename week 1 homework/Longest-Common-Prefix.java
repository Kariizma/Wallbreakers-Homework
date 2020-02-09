class Solution {
    public String longestCommonPrefix(String[] str) 
    {
        //checks if the array is empty
        if(str.length == 0)
        {
            return "";
        }
        //
        String lcp = str[0];
        for(int i = 1; i < str.length; i++)
        {
            while(str[i].indexOf(lcp) != 0)
            {
                lcp = lcp.substring(0,lcp.length()-1);
                if(lcp.length() == 0)
                {
                    return "";
                }
            }
        }
        return lcp;
    }
}