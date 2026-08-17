class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
        return "";
    String temp=strs[0];
    int len1=temp.length();
    int len2=0;
    for(int i=1;i<strs.length;i++)
    {
        len2=strs[i].length();
        if(len1>len2)
        {
            temp=temp.substring(0,len2);
            len1=len2;
        }
        while(len1>0)
        {
            if(temp.equals(strs[i].substring(0,len1)))
            break;
            len1--;
            if(len1==0)
            return "";
            temp=temp.substring(0,len1);
        }
    }
    return temp;

    }
}