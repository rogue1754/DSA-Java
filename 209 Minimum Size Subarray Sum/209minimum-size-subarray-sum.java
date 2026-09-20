class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0, r = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        boolean found = false;
        while (r < nums.length && l <= r) {
            if (sum >= target) {
                min = Math.min(min, r - l);
                sum -= nums[l++];
                found = true;
            } else if (sum < target)
                sum += nums[r++];
        }
        while (sum >= target) {
            min = Math.min(min, r - l);
            sum -= nums[l++];
            found = true;
        }

        if (!found)
            return 0;
        return min;
    }
}