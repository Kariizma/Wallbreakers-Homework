class Solution {
    public int[] findErrorNums(int[] nums)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int twice = -1;
        int miss = 1;

        for(int i = 0; i < nums.length; i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i = 1; i <= nums.length; i++)
        {
          if(map.containsKey(i))
          {
              if(map.get(i) == 2)
                  twice = i;
          }
            else
                miss = i;
        }
        return new int[]{twice,miss};
    }
}
