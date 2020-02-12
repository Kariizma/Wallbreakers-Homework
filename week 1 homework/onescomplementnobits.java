class Solution {
    public int findComplement(int num) {

        String n = Integer.toBinaryString(num);
        char[] strarray = n.toCharArray();
        for(int i = 0; i < strarray.length; i++)
        {
            if(strarray[i] == '1')
                strarray[i] = '0';
            else
                strarray[i] = '1';
        }
        n = n.valueOf(strarray);
        num = Integer.parseInt(n,2);
        return num;
    }
}
