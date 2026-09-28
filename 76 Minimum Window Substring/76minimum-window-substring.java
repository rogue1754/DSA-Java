class Solution {
    public String minWindow(String s, String t) {
        int[] freqt = new int[128];
        int[] freqs = new int[128];
        int required = 0;
        int m = s.length();
        int n = t.length();
        if (n > m)
            return "";
        for (char c : t.toCharArray())
            freqt[c]++;
        char[] arr = s.toCharArray();
        int l = 0;
        int r = l;
        int min = Integer.MAX_VALUE;
        int minL = -1, minR = -1;
        while (r < m) {
            while (r<m&&required != n) {
                if (freqt[arr[r]] != 0) {
                    freqs[arr[r]]++;
                    if (freqs[arr[r]] == freqt[arr[r]])
                        required += freqt[arr[r]];
                }
                r++;
            }
            while (required == n) {
                while (freqt[arr[l]] == 0)
                    l++;
                if (r - l < min) {
                    min = r - l;
                    minL = l;
                    minR = r;
                }
                freqs[arr[l]]--;
                if(freqs[arr[l]]<freqt[arr[l]])
                    required-=freqt[arr[l]];
                l++;
            }
        }

        if (min == Integer.MAX_VALUE)
            return "";
        return s.substring(minL, minR);
    }

}