class Solution {
    public int minOperations(int[] nums, int x) {
        int sum = 0;
        int l = 0;
        int total = 0;
        for (int i : nums)
            total += i;
        int max = -1;
        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];
            while (l<=r&&sum> total-x)
                sum -= nums[l++];
            if (sum == total-x) {
                max = Math.max(max, r - l+1);
            }
        }
        return max==-1 ? -1 : nums.length-max;
    }
}