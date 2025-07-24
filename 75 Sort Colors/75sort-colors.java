class Solution {
    public void sortColors(int[] nums) {
        int temp = 0, l = 0, r = nums.length - 1;
         while (nums[r] == 2 && r > l)
                r--;
            while (nums[l] == 0 && r > l) {
                l++;
            }
            int mid=l;
       while(mid<=r) {
           // if (mid > r)
             //   break;
           
            if (nums[mid] == 0) {
                nums[mid] = nums[l];
                nums[l] = 0;
                l++;
                mid++;
            }
            else if (nums[mid] == 2) {
                nums[mid] = nums[r];
                nums[r] = 2;
                r--;
            }
            else
            mid++;
        }
    }
}