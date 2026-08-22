class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int product=1;
        for(int i=n;i>0;i/=10)
        {
            int t=i%10;
            sum+=t;
            product*=t;
            
        }
        return n%(sum+product)==0?true:false;
    }
}