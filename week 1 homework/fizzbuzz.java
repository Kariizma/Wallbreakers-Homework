import java.util.*;
class Solution {
    public List<String> fizzBuzz(int n)
    {
        ArrayList<String> fizzbuss = new ArrayList<>(n);
        for(int i = 1; i <= n; i++)
        {
            if(i % 5 == 0 && i % 3 == 0)
            {
                fizzbuss.add("FizzBuzz");
            }
            else if(i % 5 == 0)
            {
                fizzbuss.add("Buzz");
            }
            else if(i % 3 == 0)
            {
                fizzbuss.add("Fizz");
            }
            else
            {
                fizzbuss.add(""+ i);
            }
        }
        return fizzbuss;

    }
}
