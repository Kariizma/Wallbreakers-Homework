class Solution {
    public int firstUniqChar(String s)
    {
        if(s.isEmpty())
            return -1;
        for(int i = 0; i < s.length(); i++)
        {
            char x = s.charAt(i);
            int last = s.lastIndexOf(x);
            int first = s.indexOf(x);
            if(last == first && s.indexOf(x) != -1)
            {
                return i;
            }
        }
        return -1;
    }
}
