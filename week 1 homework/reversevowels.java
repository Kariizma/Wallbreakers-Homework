import java.util.*;
class Solution {
    public String reverseVowels(String s)
    {
        //turn string into char[] for ez swaps
        //create a hashset which countains all vowels
        //check if one pointer has vowel stop, move other pointer
        //then swap when both are on vowels
        //the end

        HashSet<Character> vowelset = new HashSet<>();
        vowelset.add('a');
        vowelset.add('e');
        vowelset.add('i');
        vowelset.add('o');
        vowelset.add('u');
        vowelset.add('A');
        vowelset.add('E');
        vowelset.add('I');
        vowelset.add('O');
        vowelset.add('U');

        char[] strarray = s.toCharArray();
        int i = 0;
        int j = strarray.length-1;
        while(i < j)
        {
            if(vowelset.contains(strarray[i]) && vowelset.contains(strarray[j]))
            {
                char temp = strarray[j];
                strarray[j] = strarray[i];
                strarray[i] = temp;
                i++;
                j--;
            }
            if(!vowelset.contains(strarray[i]))
            {
                i++;
            }
            if(!vowelset.contains(strarray[j]))
            {
                j--;
            }
        }
        s = String.valueOf(strarray);
        return s;
    }
}
