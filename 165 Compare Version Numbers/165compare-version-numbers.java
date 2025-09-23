class Solution {
    public int compareVersion(String version1, String version2) {
        String arr1[]=version1.split("\\.");
        String arr2[]=version2.split("\\.");
        int len1=arr1.length;
        int len2=arr2.length;
        int len=Math.min(len1,len2);
        int i=0;
        while(i<len)
        {
            int t=Integer.parseInt(arr1[i]);
            int t1=Integer.parseInt(arr2[i]);
            if(t>t1)
            return 1;
            if(t<t1)
            return -1;
            i++;
        }
        while(i<len1)
        {
            if(Integer.parseInt(arr1[i++])!=0)
            return 1;
        }
        while(i<len2)
        {
            if(Integer.parseInt(arr2[i++])!=0)
            return -1;
        }
        return 0;
}
}