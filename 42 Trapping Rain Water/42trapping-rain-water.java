class Solution {
    public int trap(int[] height) {
        int l=0,r=height.length-1;
        int lmax=-1,rmax=-1;
        int sum=0;
        while(l<r)
        {
            if(height[l]<=height[r])
            {
                lmax=lmax<=height[l]?height[l]:lmax;
                sum+=(lmax-height[l]);
                l++;
            }
            else
            {
                rmax=rmax<=height[r]?height[r]:rmax;
                sum+=(rmax-height[r]);
                r--;
            }
        }
        return sum;
    }
}