class Solution {
    public int uniqueMorseRepresentations(String[] words)
    {
        //create an array for morse code
        //use ascii codes to access positions within the array
        //convert each word in the words array into morsecode via loops
        //
        int count = 0;
        String[] morsearray = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < words.length; i++)
        {
            String curr = words[i];
            String replacestr = "";
            for(int j = 0; j < curr.length(); j++)
            {
                int location = (int) curr.charAt(j) - 97;
                replacestr += morsearray[location];
            }
            set.add(replacestr);
        }
        return set.size();
    }
}
