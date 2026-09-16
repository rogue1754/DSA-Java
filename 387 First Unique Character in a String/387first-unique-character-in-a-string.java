class Solution {
    public int firstUniqChar(String s) {
        for(int i=0;i<s.length();i++)
        {
            char c= s.charAt(i);
            if(s.lastIndexOf(c)==i && s.indexOf(c)==i)
            return i;
        }
        return -1;
    }
}