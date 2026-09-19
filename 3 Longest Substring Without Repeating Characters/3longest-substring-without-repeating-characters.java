class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int max = 0, l = 0, i = 0;
        while (i < s.length()) {
            char c=s.charAt(i);
            if (!set.add(c)) {
                max =Math.max(i-l,max);
                set.remove(s.charAt(l));
                l++;
            } else
                i++;
        }
        return Math.max(i-l,max);
    }
}