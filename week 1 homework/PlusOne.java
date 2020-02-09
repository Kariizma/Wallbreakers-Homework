class Solution {
    public int[] plusOne(int[] digits) 
    {
        //starts at the back of the array because thats how adding one works in math
        for(int i = digits.length-1;i >= 0; i--)
        {
            //checks if it goes to 10, if it doesnt we can just return
            int one = digits[i] + 1;
            if(one != 10)
            {
                digits[i] = one;
                return digits;
            }
            //if it does then we have to make the element at that specific index 0
            digits[i] = 0;
            //if i is at the 0 index then we have to create a new array EX: 9999 + 1 = 10000
            if(i == 0)
            {
                int[] newarr = new int[digits.length+1];
                newarr[0] = 1;
                System.arraycopy(digits,0,newarr,1,digits.length);
                return newarr;
            }
        }
        return digits;
    }
}