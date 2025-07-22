class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int r = 0, l = 0, j = 0, sum = 0, lsum = 0;
        Set<Integer> s = new HashSet<>();
        int len = nums.length;
        while (r < len) {
            if (!s.add(nums[r])) {
                lsum = Math.max(lsum, sum);
                while (!s.add(nums[r])&&l<len) {
                    s.remove(nums[l]);
                    sum -= nums[l];
                    l++;
                }
              /*  s.remove(nums[l]);
                sum-=nums[l];
                l++;
                s.add(nums[r]);
                sum+=nums[r];*/
                sum+=nums[r];
                r++;
            }
            else {
                sum += nums[r];
                r++;
            }
            lsum = Math.max(lsum, sum);
        }
        return lsum;
    }
}