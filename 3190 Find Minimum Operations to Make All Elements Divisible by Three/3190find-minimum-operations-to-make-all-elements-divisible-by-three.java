class Solution {
    public int minimumOperations(int[] nums) {
        int c=0;
        for(int e: nums)
        {
            if(e%3!=0)
            c++;
        }
        return c;
    }
}