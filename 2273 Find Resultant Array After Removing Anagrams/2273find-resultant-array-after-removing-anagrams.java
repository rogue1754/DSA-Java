class Solution {
    public List<String> removeAnagrams(String[] words) {

        int len = words.length;
        ArrayList<String> result = new ArrayList<>();
        int c = 0;
        for (int i = 1; i < len; i++) {
            result.add(words[c]);
            while (i < len && isAnagram(words[c], words[i]))
                i++;
            c = i;
        }
        if (c < len)
            result.add(words[c]);
        return result;
    }

    public boolean isAnagram(String s, String t) {
        char[] c = s.toCharArray();
        char[] c1 = t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(c1);
        return Arrays.equals(c, c1);
    }
}