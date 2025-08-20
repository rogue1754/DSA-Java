class Solution {     
    public boolean isValid(String s) {
        Stack<Character> st= new Stack<>();
        if(s.length()==1)
            return false;
        for(char e:s.toCharArray())
        {
            if(e=='('||e=='{'||e=='[')
            {
                st.push(e);
            }
            else
            {
                if(st.isEmpty()) return false; 
                char temp=st.pop();
                if(temp=='('&&e==')'||temp=='{'&&e=='}'||temp=='['&&e==']')
                continue;
                else
                return false;
            }
        }
        return st.isEmpty();
    }
               }