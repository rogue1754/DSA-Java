class Solution {
    public int numSub(String s) {
        long c=0, result=0;
        int len=s.length();
        for(int i=0;i<len;i++)
        {   
            if(s.charAt(i)=='0')
            continue;
            while(i<len&&s.charAt(i)=='1')
            {
              c++;i++;
            }
            result=result+((c*(c+1))/2);
            c=0;
        }
        return (int)(result%1000000007);
    }
}