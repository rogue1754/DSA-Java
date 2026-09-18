class Solution {
    public boolean validPalindrome(String s) {
        int start=0;
        int end=s.length()-1;
        boolean found=false;
        int c=0;
        while(start<=end)
        {
            if(s.charAt(start)==s.charAt(end))
            {
                start++;
                end--;
            }
            else 
            {
                if(palin(s,start+1,end)||palin(s,start,end-1))
                return true;
                else return false;
            }
        }
        return true;
    }
    public boolean palin(String s, int a, int b)
    {
        while(a<=b)
        {
            if(s.charAt(a)==s.charAt(b))
            {
                a++;
                b--;
            }
            else
            return false;
        }
        return true;
    }
}