class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st1 = new Stack<>();
        int len = temperatures.length;
        int result[] = new int[len];
        for(int i=0;i<len;i++) {
            while (!st1.isEmpty()&& temperatures[i]>temperatures[st1.peek()]) {
                    int t=st1.pop();
                    result[t] = i - t;
            }
            st1.push(i);
        }
        return result;
    }
}