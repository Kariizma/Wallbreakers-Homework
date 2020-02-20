public boolean wordPattern(String pattern, String str)
{
    /*gameplan:
    - create a map that associates Strings K and Characters y
    - then use string builder to rebuild the characters and see if it equals our pattern.
    - if its equal return true if not return false
    - we will use the hashmap function putIfAbsent to check if a key is already assigned


    */
    HashMap<Character,String> map = new HashMap<>();
    String[] strarray = str.split(" ");
    String ans = "";
    if(strarray.length != pattern.length())
        return false;
    for(int i = 0; i < strarray.length; i++)
    {
        if(!map.containsKey(pattern.charAt(i)))
            if(map.containsValue(strarray[i]))
                return false;
        map.putIfAbsent(pattern.charAt(i),strarray[i]);
        ans += map.get(pattern.charAt(i))+" ";
    }
    ans = ans.substring(0,ans.length()-1);
    if(ans.equals(str))
        return true;
    else
        return false;


}
