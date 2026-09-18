class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int r=m+n-1, mid=m-1, k=n-1;
        while(k>=0)
        {
            if(mid>=0&&nums1[mid]>=nums2[k])
                nums1[r]=nums1[mid--];
            else
            nums1[r]=nums2[k--];
            r--;
        }

    }
}