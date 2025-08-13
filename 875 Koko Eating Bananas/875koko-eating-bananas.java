class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int sum=0;
        for(int i:piles)
            sum=i>sum?i:sum;
        int start=1,end=sum,mid=0,ans=0;
        while (start<=end)
            {
                mid=start+(end-start)/2;
                if(check(piles,mid,h))
                {
                    ans=mid;
                    end=mid-1;
                }       
                else 
                    start=mid+1;
            }
        return ans;
        
    }
public boolean check(int arr[],int target,int hr)
    {
        for(int i:arr)
            {
                hr-=(i+target-1)/target;
                if(hr<0)
                    return false;
            }
        return true;
    }
}