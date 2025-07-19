class Solution {
    public int binary(int[] nums,int start, int end, int target)
    {
        int mid=0;
        int ans=-1;
        Boolean t=(start==0);
        while(start<=end)
        {
            mid=(start+end)/2;
            if(nums[mid]==target)
            {
                ans=mid;
                if(t){
                end=mid-1;continue;
                }
                else
                {
                    start=mid+1;continue;
                }
            }
            else if(target>nums[mid])
            {
                start= mid+1;
            }
            else 
            {
                end=mid-1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) { 
        int[] result={-1,-1};
        result[0]=binary(nums,0,nums.length-1,target);
        if(result[0]==-1)
        return result;
        result[1]=binary(nums,result[0]+1,nums.length-1,target);
        if(result[1]==-1)
        result[1]=result[0];
        return result;
    } 
}