class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        Map<Integer, boolean[]> check = new HashMap<>();

        long result = 2L * n;
        for (int i = 0; i < reservedSeats.length; i++) {

            int row = reservedSeats[i][0];
            int seat = reservedSeats[i][1];
            if (!check.containsKey(row)) {
                boolean[] inner = { true, true, true };
                check.put(row, inner);
            }

            if (seat == 2 || seat == 3)
                check.get(row)[0] = false;

            else if (seat == 4 || seat == 5) {
                check.get(row)[0] = false;
                check.get(row)[1] = false;
            } else if (seat == 6 || seat == 7) {
                check.get(row)[1] = false;
                check.get(row)[2] = false;
            } else if (seat == 8 || seat == 9)
                check.get(row)[2] = false;
        }
         for(boolean b[]: check.values())
            {
               if(b[0]&&b[1]&&b[2])
               continue;
               else if(!b[0]&&!b[1]&&!b[2])
               result-=2;
               else result--;
            }
        return (int)result;
    }
}