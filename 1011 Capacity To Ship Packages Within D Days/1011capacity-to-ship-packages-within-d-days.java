class Solution {
    public int shipWithinDays(int[] weights, int days) {
       int start=0,end=0;
       for(int i:weights)
       {
        end+=i;
        start=Math.max(start,i);
       }
        int mid = 0;
        int result = end;
        while (start <= end) {

            mid = start + (end - start) / 2;
            if (check(weights, days, mid)) {
                result = mid;
                end = mid - 1;
            } else
                start = mid + 1;
        }
        return result;
    }

    public boolean check(int[] arr, int days, int target) {
        int sum = 0;
        days--;
        for (int i : arr) {
            if (sum + i > target) {
                sum = 0;
                days--;
            }
            sum += i;
            if (days < 0)
                return false;
        }
        return days >= 0;
    }
}