class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;
        int count1[] = new int[26];
        int count2[] = new int[26];
        int matches = 0;
        for (char c : s1.toCharArray()) {
            if (count1[c - 'a'] == 0)
                matches++;
            count1[c - 'a']++;
        }
        matches = 26 - matches;
        int l = 0;
        for (int r = 0; r < s2.length(); r++) {
            char c = s2.charAt(r);
            if (count1[c - 'a'] == count2[c - 'a'])
                matches--;
            count2[c - 'a']++;
            if (count1[c - 'a'] == count2[c - 'a'])
                matches++;
            if (r - l + 1 == s1.length()) {
                if (matches == 26)
                    return true;
                if (count1[s2.charAt(l) - 'a'] == count2[s2.charAt(l) - 'a'])
                    matches--;
                count2[s2.charAt(l) - 'a']--;
                if (count1[s2.charAt(l) - 'a'] == count2[s2.charAt(l) - 'a'])
                    matches++;
                l++;
            }
        }
        return false;
    }
}