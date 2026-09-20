class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0, r = 0;
        int highest = 0;
        int total = 0;
        int longest = 0;
        int arr[] = new int[26];
        while (r < s.length() && l <= r) {
            char c = s.charAt(r);
            arr[c - 'A']++;
            total++;
            highest = arr[highest] <= arr[c - 'A'] ? c - 'A' : highest;
            if (total - arr[highest] > k) {
                longest = Math.max(longest, r - l);
                arr[s.charAt(l) - 'A']--;
                l++;
                total--;
            }
              r++;    
        }
        return Math.max(longest, r - l);
    }
}