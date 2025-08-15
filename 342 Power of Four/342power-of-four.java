class Solution {
    public boolean isPowerOfFour(int n) {
        if(n%3==1 && ((n&(n-1))==0))
        return true;
        return false;
    }
}