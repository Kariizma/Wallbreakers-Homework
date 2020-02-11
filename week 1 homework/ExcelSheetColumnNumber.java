class Solution {
    public int titleToNumber(String s)
    {
        //first we check if the string is empty
        //to solve question we need to create a for loop from the back because thats how math works
        //now we have to use math formula to solve problem
        if(s.isEmpty())
        {
            return 0;
        }
        int exp = 1;
        int answer = 0;
        for(int i = s.length()-1; i >= 0; i--)
        {
            if(i == s.length()-1)
            {
                answer += s.charAt(i) - 'A' + 1;
            }
            else
            {
                answer += Math.pow(26,exp)*(s.charAt(i) - 'A' + 1);
                exp++;
            }
        }
        return answer;
    }
}
