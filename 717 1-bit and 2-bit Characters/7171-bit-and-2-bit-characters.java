class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int len=bits.length;
        int i=0;
        if(len==1)
        return true;
        while(i<len)
        {
            if(bits[i]==0)
            i++;
            else
            i+=2;
            if(i==len-1)
            return true;
        }
        return false;
    }
}