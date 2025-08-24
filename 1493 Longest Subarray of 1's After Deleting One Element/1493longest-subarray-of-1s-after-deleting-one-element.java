class Solution {
    public int longestSubarray(int[] nums) {
        int c = 0;
        int maxlen = 0;
        int start = 0, end = 0;
        while (end < nums.length) {
             if (nums[end] == 0) {
                c++;
                while(c>1)
                {
                    if(nums[start]==0)
                    c--;
                    start++;
                }
            }
            maxlen = Math.max(maxlen, end-start);
            end++;
        }
        return maxlen;
    }
}