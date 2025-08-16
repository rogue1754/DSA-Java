class Solution {
    public int maximum69Number(int num) {
        String str = String.valueOf(num); // convert to string
        int[] digits = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0'; // convert char to int
        }

        for (int j = 0; j < digits.length; j++) {
            if (digits[j] == 6) {
                digits[j] = 9;
                break;
            }
        }

        int number = 0;
        for (int d : digits) {
            number = number * 10 + d;
        }
        return number;
    }
}