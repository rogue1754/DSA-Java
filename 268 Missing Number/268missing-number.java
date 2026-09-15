class Solution {
    public int missingNumber(int[] nums) {
        long sum=0;
        long max=nums.length;
        for(int i: nums)
            sum+=i;
        long totalSum=max*(max+1)/2;       
        return (int)(totalSum-sum);
    }
}