class Solution {
    Boolean palindrome(String t) {
        int i = 0;
        int k = t.length() - 1;
        while (i < k) {
            if (t.charAt(i++) != t.charAt(k--))
                return false;
        }
        return true;
    }

    public int maxPalindromes(String s,int k) {
        int count=0;
        int l=0;
        int r=k;
        while(r<=s.length()) {
            int t=l;
            boolean found=false;
            while(t+k<=r) {
                if(palindrome(s.substring(t,r))) {
                    l=r;
                    r=l+k;
                    count++;
                    found=true;
                    break;
                }
                t++;
            }
            if(!found) {
                r++;
            }
        }
        return count;
    }
}