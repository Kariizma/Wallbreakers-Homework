import java.util.*;
class Solution {
    public boolean isIsomorphic(String s, String t)
    {
        HashMap<Character,Character> map = new HashMap<>();
        StringBuilder sb = new StringBuilder(s.length());
        if(s.length() != t.length())
            return false;
        for(int i = 0; i < s.length(); i++)
        {
            if(!map.containsKey(t.charAt(i)))
                if(map.containsValue(s.charAt(i)))
                    return false;
            map.putIfAbsent(t.charAt(i),s.charAt(i));
            sb.append(map.get(t.charAt(i)));
        }
        String ans = sb.toString();
        if(ans.equals(s))
            return true;
        else
            return false;

    }
}
