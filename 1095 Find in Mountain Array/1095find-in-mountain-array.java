/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int len=mountainArr.length();
        int start = 1, end = len - 2;
        int mid = 0;
        while (start < end) {
            mid = start + (end - start) / 2;
            if ( mountainArr.get(mid) < mountainArr.get(mid+1))
                start = mid + 1;
            else
                end = mid ;
        }
        int peak=start;
        int left=bs(0,peak,target,mountainArr,true);
        if(left>=0)
        return left;
        return bs(peak+1,len-1,target,mountainArr,false);
    }
    int bs(int start,int end,int target,MountainArray arr,boolean ascend)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            int val=arr.get(mid);
            if(val==target)
            return mid;
            if(ascend)
            {
                if(val<target)
                start=mid+1;
                else
                end=mid-1;
            }
            else
            {
                 if(val>target)
                start=mid+1;
                else
                end=mid-1;
            }
        }
            return -1;
    }
}