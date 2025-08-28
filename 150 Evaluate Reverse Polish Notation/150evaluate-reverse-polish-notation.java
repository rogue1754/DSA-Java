class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        String a = "+-*/";
        for (String e : tokens) {
            if (a.contains(e)) {
                int num1 = st.pop();
                int num2 = st.pop();
                switch (e) {
                    case "+":
                        st.push(num1 + num2);
                        break;
                    case "-":
                        st.push(num2 - num1);
                        break;
                    case "*":
                        st.push(num1 * num2);
                        break;
                    case "/":
                        st.push(num2 / num1);
                        break;
                }
            } else
                st.push(Integer.parseInt(e));
        }
        return st.pop();
    }
}