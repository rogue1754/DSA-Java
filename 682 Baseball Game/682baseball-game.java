class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for (String a : operations) {
            if (a.equals("+")) {
                int temp = st.pop();
                int temp2 = st.peek() + temp;
                st.push(temp);
                st.push(temp2);
            } else if (a.equals("D")) {
                st.push(st.peek() * 2);
            } else if (a.equals("C")) {
                st.pop();
            } else {
                st.push(Integer.parseInt(a));
            }
        }
        int sum=0;
        for(int e:st)
        sum+=e;
        //return st.stream().reduce(0, (sum, value) -> sum + value);
        return sum;
    }
}