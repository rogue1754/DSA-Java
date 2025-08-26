class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length())
        return "";
        HashMap<Character, Integer> hs1 = new HashMap<>();
        HashMap<Character, Integer> hs2 = new HashMap<>();
        for (char e : t.toCharArray()) {
            hs1.put(e, hs1.getOrDefault(e, 0) + 1);
        }
        int len = Integer.MAX_VALUE;
        int rstart = -1, rend = -1;
        int start = 0, end = 0;
        char arr[] = s.toCharArray();
        int total = hs1.size();
        int temp = 0;
        while (end < s.length()) {
            if (hs1.containsKey(arr[end])) {
                hs2.put(arr[end], hs2.getOrDefault(arr[end], 0) + 1);
                if (hs1.get(arr[end]).intValue() == hs2.get(arr[end]).intValue()) {
                    temp++;
                }
            }
            while(temp == total) {
                if (end - start + 1 < len) {
                    len = end - start + 1;
                    rend = end;
                    rstart = start;
                }
                if (hs1.containsKey(arr[start])) {
                    hs2.put(arr[start], hs2.get(arr[start]) - 1);
                    if (hs2.get(arr[start]).intValue() < hs1.get(arr[start]).intValue()) {
                        temp--;
                    }
                }
                start++;
            }
            end++;
        }

        if (rstart == -1 || rend == -1)
            return "";
        return s.substring(rstart, rend + 1);
    }
}