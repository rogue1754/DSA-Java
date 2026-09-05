class Solution {
    public int firstStableIndex(int[] nums, int k) {
          int len=nums.length;
        int pre[]= new int[len];
        int suff[]= new int[len];
        int lar=nums[0];
        int l=0;
        for(int i:nums)
        {
            if(i>lar)
            lar=i;
            pre[l++]=lar;
        }
        int small=nums[len-1];
        l=len-1;
         for(int i=len-1;i>=0;i--)
        {
            if(nums[i]<small)
            small=nums[i];
            suff[l--]=small;
        }

        for(int i=0;i<len;i++)
        {
            if(pre[i]-suff[i]<=k)
            return i;
        }
        return -1;
    }
}