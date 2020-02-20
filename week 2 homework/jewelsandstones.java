class Solution {
    public int numJewelsInStones(String J, String S)
    {
        //turning j into a character array, then putting it in a set then check if its in the set to see if we have any jewels the end
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        char[] j = J.toCharArray();
        for(int i = 0; i < j.length; i++)
            set.add(j[i]);
        for(int i = 0; i < S.length(); i++)
        {
            if(set.contains(S.charAt(i)))
                count++;
        }
        return count;

    }
}
