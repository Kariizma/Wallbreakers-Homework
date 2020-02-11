import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t)
    {
        //create a hashmap to store first string characters and count of characters
        //use hashmap and remove until hashmap is empty, if map is empty return true;
        //if map is not empty then return false

        if(s.length() != t.length())
            return false;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++)
        {
            if(!map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i),1);
            }
            else
            {
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }

        for(int i = 0; i < t.length(); i++)
        {
            if(map.containsKey(t.charAt(i)))
            {
                map.put(t.charAt(i),map.get(t.charAt(i))-1);
            }
            else
            {
                return false;
            }
            if(map.get(t.charAt(i)) == 0)
                map.remove(t.charAt(i));
        }
        return true;
    }
}
