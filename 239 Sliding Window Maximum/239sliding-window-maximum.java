class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        int len = nums.length;
        int[] result = new int[len - k + 1];
        for (int i = 0; i < len; i++) {
            if (!dq.isEmpty() && dq.peekFirst() < i - k + 1)
                dq.pollFirst();
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i])
                dq.pollLast();
            dq.offerLast(i);
            if (i >= k - 1) {
                result[i - k + 1] = nums[dq.peekFirst()];
            }
        }
        return result;
    }
}