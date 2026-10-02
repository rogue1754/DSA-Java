class Solution {
    public int splitArray(int[] nums, int k) {
        int end=0;
        int start=0;
        for(int i:nums)
        {
            end+=i;
            start=Math.max(i,start);
        }
        int min=Integer.MAX_VALUE;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            int sum=check(nums,k,mid);
            if(sum!=-1)
            {
                min=Math.min(sum,min);
                end=mid-1;
            }
            else
                start=mid+1;
        }
        return min;
    }
    public int check(int[] nums,int k,int target)
    {
        int sum=0;
        k--;
        int max=0;
        for(int i:nums)
        {
            if(sum+i>target)
            {max=Math.max(max,sum);
                sum=0;
                k--;
            }
            sum+=i;

            if(k<0)
                return -1;
        }
        max=Math.max(max,sum);
        return max;
    }
}