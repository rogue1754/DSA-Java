class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int count = 0, smallest = s.length() + 1;
        int a = 0, b = 0;
        String result = "";
        while (true) {
            

            if (count < k) {
                if (b == s.length()) break;
                if (s.charAt(b) == '1')
                    count++; 
                b++;
            }

            if (count == k) {
                if (smallest > (b - a)) {
                    smallest = b - a;
                    result = s.substring(a, b);
                } else if (smallest == (b - a) && result.compareTo(s.substring(a, b)) > 0) {
                    result = s.substring(a, b);
                }
                if (s.charAt(a) == '1') {
                    count--;
                }
                a++;
            }

        }
        return result;
    }
}