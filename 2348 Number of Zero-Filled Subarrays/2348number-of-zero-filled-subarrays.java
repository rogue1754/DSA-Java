class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long streak=0;
        long c=0;
        for(int e:nums)
        {
            if(e==0)
            {
                streak++;
                c+=streak;
            }
            else
            streak=0;
        } 
        return c;  
         }
}