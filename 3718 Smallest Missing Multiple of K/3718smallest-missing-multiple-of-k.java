class Solution {
    public int missingMultiple(int[] nums, int k) {
        int i = 1;
        Set<Integer> temp = new HashSet<>();
        for (int x : nums) {
            temp.add(x);
        }
        while (true) {
            if (!temp.contains(k * i))
                break;
            i++;
        }
        return k * i;
    }
}