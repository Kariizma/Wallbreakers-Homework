class Solution {

    //turn string into array because easier swaps
    //make 3 pointers, 1 for start word, 1 for end word, 1 for findspace;
    //go to the first space,
    public String reverseWords(String s)
    {
        char[] strarray = s.toCharArray();
        int start = 0;
        for(int i = 0; i < strarray.length; i++)
        {
            if(Character.isWhitespace(s.charAt(i)))
            {
                reverse(strarray, start, i - 1);
                start = i+1;
            }
            if(i == strarray.length-1)
            {
                reverse(strarray,start,strarray.length-1);
                i = 100000;
            }
        }
        return s = s.valueOf(strarray);
    }


    private char[] reverse(char[] strarray, int start, int end)
    {
        while(start < end)
        {
            char temp = strarray[end];
            strarray[end] = strarray[start];
            strarray[start] = temp;
            start++;
            end--;
        }
        return strarray;
    }
}
