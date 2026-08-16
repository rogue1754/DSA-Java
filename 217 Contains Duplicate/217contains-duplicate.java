class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> temp = new HashSet<>();
        for(int n:nums)
        {
            if(!temp.add(n))
             return true;
        }
          return false;
    }
}