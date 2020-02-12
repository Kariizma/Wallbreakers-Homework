class Solution {
    public boolean detectCapitalUse(String word)
    {
        char firstletter = word.charAt(0);
        char lastletter = word.charAt(word.length()-1);

        if(Character.isUpperCase(firstletter) && Character.isUpperCase(lastletter))
        {
            //if any of them are lowercase return false
            for(int i = 0; i < word.length(); i++)
            {
                if(!Character.isUpperCase(word.charAt(i)))
                    return false;
            }
            return true;
        }
        if(Character.isLowerCase(firstletter) && Character.isLowerCase(lastletter))
        {
            //if any of them are uppercase return false
            for(int i = 0; i < word.length(); i++)
            {
                if(Character.isUpperCase(word.charAt(i)))
                    return false;
            }
            return true;
        }
        if(Character.isUpperCase(firstletter) && Character.isLowerCase(lastletter))
        {
            //if second char to second to last char are upper then return false
            for(int i = 1; i < word.length()-1; i++)
            {
                if(Character.isUpperCase(word.charAt(i)))
                    return false;
            }
            return true;
        }

        return false;
    }
}
