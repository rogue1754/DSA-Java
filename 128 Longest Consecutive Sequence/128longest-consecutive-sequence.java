class Solution {
    public int longestConsecutive(int[] nums) {
        int lc = 0;
        int c = 1;
        Set<Integer> temp = new HashSet<>();
        for (int a : nums) {
            temp.add(a);
        }
        for (int a : temp) {
            if (!temp.contains(a - 1)) {
                c = 1;
                while (temp.contains(++a)) {
                    c++;
                }
            lc = lc < c ? c : lc;
            }
        }
        return lc;
    }
}