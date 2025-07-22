class Solution {
    public boolean isPalindrome(String s) {
         int len = s.length() - 1;
        int n = len;
        int i=0;
        if (s.isEmpty())
            return true;
        while(i<n) {
             char ch = s.charAt(i);
             char ch1=s.charAt(n);
            if(!Character.isLetterOrDigit(ch))
            {
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(ch1))
            {
                n--;
                continue;
            }
           if (Character.toLowerCase(ch) == Character.toLowerCase(ch1)) {
                n--;
                i++;
                continue;
            }
            else
            return false;
        }
        return true;
    }

   /* public String rem(String a) {
        String temp = "";
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (Character.isLetterOrDigit(ch))
                temp += Character.toLowerCase(ch);
        }
        return temp;
    }*/
}