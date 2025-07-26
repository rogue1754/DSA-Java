class Solution {
    public int mySqrt(int x) {
        int start=0,end=x/2,mid=0;
        if(x==1)
        return 1;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if((long)mid*mid==x)
            return mid;
            else if(x<(long)mid*mid)
            end=mid-1;
            else
            start=mid+1;
        }
        return start-1;
    }
}