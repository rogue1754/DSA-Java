class Solution {
    public int largestInteger(int[] nums, int k) {
        int arr[]= new int[51];
        int len=nums.length;
        int res=-1;
        if(k==len)
        {
            for(int i: nums)
            {
               res=Math.max(res,i);
            }
            return res;
        }
        for(int i: nums)
        {
          arr[i]++;
        }
        if(k==1)
        {
            for(int i=50;i>=0;i--)
            {
                if(arr[i]==1)
                return i;
            }
            return -1;
        }

        if(arr[nums[0]]==1)
        {
            res=Math.max(nums[0],res);
        }
        if(arr[nums[len-1]]==1)
        {
            res=Math.max(nums[len-1],res);
        }
        return res;
    }
}