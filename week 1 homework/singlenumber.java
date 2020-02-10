import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        //create hashset
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++)
        {
            //check if in hashset if it is remove
            if(set.contains(nums[i]))
            {
                set.remove(nums[i]);
            }
            //add into hashset
            else
            {
                set.add(nums[i]);
            }
        }
        //will only be 1 element in set, just go to it and return ez pz.
        return set.iterator().next();
    }
}
