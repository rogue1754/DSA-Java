class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int start, end;
        for (int i = 0; i < nums.length - 2; i++) {
              if (i > 0 && nums[i] == nums[i - 1]) continue;
            start = i + 1;
            end = nums.length - 1;
            while (start < end) {
               /*if (start == i) {
                    start++;
                    continue;
                }
                if (end == i) {
                    end--;
                    continue;
                }*/
                if (nums[start] + nums[end] == -nums[i]) {
                    result.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    while (start < end && nums[start] == nums[start + 1])
                     start++;
                    while (start < end && nums[end] == nums[end - 1])
                     end--;
                    start++;
                    end--;
                } else if (nums[start] + nums[end] < -nums[i]) {
                    start++;
                } else
                    end--;
            }
        }
        return result;
    }
}