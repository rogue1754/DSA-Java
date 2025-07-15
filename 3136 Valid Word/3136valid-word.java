class Solution {
    public boolean isValid(String word) {
        if(word.length()<3)
        return false;
        boolean isvo=false,isco=false;
        for(char ch:word.toCharArray())
        {
            if(Character.isLetter(ch))
            {
               if("AEIOUaeiou".indexOf(ch)>=0)
                isvo=true;
                else
                isco=true;
            }
            else if(!Character.isDigit(ch))
            return false;
        }
        if(isco==true&&isvo==true)
        return true;
        return false;
    }
}