class Solution {
    public String reverseParentheses(String s) {
        char[] arr=s.toCharArray();
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='('){
                st.push(i);
                continue;
            }
            if(arr[i]==')')
            {
                int l=st.pop()+1;
                int r=i-1;
                while(l<r)
                {
                    char temp= arr[l];
                    arr[l]=arr[r];
                    arr[r]=temp;
                    l++;r--;
                }
            }
        }
        StringBuilder result= new StringBuilder();
        for(char c:arr)
        {
            if(c=='('||c==')')
                continue;
            result.append(c);
        }
        return result.toString();
    }
}