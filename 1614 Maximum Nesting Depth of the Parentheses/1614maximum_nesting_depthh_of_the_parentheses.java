class Solution {
    public int maxDepth(String s) {
        int c=0;
        int max=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='(')
                c++;
            else if(ch==')')
            {
                max=Math.max(c,max);
                c--;
            }
        }
        return max;
    }
}