class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        StringBuilder s=new StringBuilder();
        while(i<word1.length()&&i<word2.length())
        {
            s.append(word1.charAt(i));
            s.append(word2.charAt(i++));
        }
        while(i<word1.length())
        s.append(word1.charAt(i++));
        
        while(i<word2.length())
        s.append(word2.charAt(i++));
        return s.toString();
    }
}