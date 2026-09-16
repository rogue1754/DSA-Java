class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k %= len;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[(i + k) % len] = nums[i];
        }
        for (int i = 0; i < len; i++) {
            nums[i] = arr[i];
        }
    }
}