class Solution {
    public boolean isPalindrome(int x) {
        int temp=x,rev=0;
        while(temp>0)
        {
            rev=temp%10+rev*10;
            temp/=10;
        }
    if(x==rev)
    return true;
    return false;  
    }
}