class Solution {
    public String largestGoodInteger(String num) {
        int s=999;
        while(s>0)
        {
            String s1=String.valueOf(s);
            if(num.contains(s1))
            return s1;
            s-=111;
        }
        if(num.contains("000"))
        return "000";
        return "";
    }
}