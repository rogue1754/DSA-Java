class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int e:nums)
        {
            if(e!=val)
            nums[k++]=e;
        }
        return k;
    }
}