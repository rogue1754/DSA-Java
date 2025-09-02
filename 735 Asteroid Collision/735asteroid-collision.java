class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
        Stack<Integer> st=new Stack<>();
        int i=0; 
        while(i<n){
            if(asteroids[i]>0){
                st.push(asteroids[i]);
                i++;
            }
            else{
                if(st.size()==0 || st.peek()<0){
                    st.push(asteroids[i]);
                    i++;
                }else if(Math.abs(asteroids[i])> st.peek()){
                    st.pop();
                }
                else if(Math.abs(asteroids[i])<st.peek()){
                    i++;
                }else{
                    st.pop();
                    i++;
                }
            }
        }
        int[] ans=new int[st.size()];
        for(int j=ans.length-1; j>=0; j--){
            ans[j]=st.pop();
        }
        return ans;
    }
}