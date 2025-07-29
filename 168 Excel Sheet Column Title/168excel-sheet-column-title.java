class Solution {
    public String convertToTitle(int columnNumber) {
       StringBuilder b = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; 
            int r = columnNumber % 26;
            b.append((char) (r + 'A')); 
            columnNumber /= 26;
        }
        return b.reverse().toString();
    }
}