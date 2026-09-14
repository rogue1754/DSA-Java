class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        int len=nums.length;
        int prefix[]= new int[len+1];
        for(int i=1;i<len+1;i++)
        {
            prefix[i]=prefix[i-1]+nums[i-1];
        }
        int l=0;int r=k;
        double maxAvg=Double.NEGATIVE_INFINITY;;
        while(r<=len)
        {
            double avg=((double)prefix[r]-prefix[l])/k;
          maxAvg=avg>maxAvg?avg:maxAvg;
          r++;
          l++;
        }
        return maxAvg;
    }
}