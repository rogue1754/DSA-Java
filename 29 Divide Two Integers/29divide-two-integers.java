class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE&&divisor==-1)
        return Integer.MAX_VALUE;
        Long a=Math.abs((long)dividend);
        Long b=Math.abs((long)divisor);
        int sign=((dividend<0)^(divisor<0))?-1:1;
        int q=0;
         for(int i=31;i>=0;i--)
         {
            if((b<<i)<=a)
            {
                a-=(b<<i);
                q|=(1<<i);
            }
         }
         return sign*q;
    }
}