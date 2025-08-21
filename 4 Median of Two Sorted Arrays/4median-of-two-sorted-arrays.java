class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length >= nums2.length)
            return mid(nums2, nums1);
        else
            return mid(nums1, nums2);
    }

    public double mid(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int start = 0, end = len1;
        int med = (len1 + len2 + 1) / 2;
        while (start <= end) {
            int i = start + (end - start) / 2;
            int j = med - i;
            int leftmax1 = (i == 0) ? Integer.MIN_VALUE : arr1[i - 1];
            int rightmin1 = (i == len1) ? Integer.MAX_VALUE : arr1[i];
            int leftmax2 = (j == 0) ? Integer.MIN_VALUE : arr2[j - 1];
            int rightmin2 = (j == len2) ? Integer.MAX_VALUE : arr2[j];

            if ((leftmax1 <= rightmin2) && (leftmax2 <= rightmin1)) {
                int leftmax = Math.max(leftmax1, leftmax2);
                if ((len1 + len2) % 2 == 1)
                    return (double)leftmax ;
                else {
                    int rightmin = Math.min(rightmin1, rightmin2);
                    return (leftmax + rightmin) / 2.0;
                }
            } else if (leftmax1 > rightmin2)
                end = i - 1;
            else
                start = i + 1;
        }
        return 0;
    }
}