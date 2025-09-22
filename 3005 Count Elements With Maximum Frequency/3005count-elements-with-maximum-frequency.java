class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int e:nums)
        {
            hs.put(e,hs.getOrDefault(e,0)+1);
        }
        int maxf=0; 
        int sum=0;
        for(int f:hs.values())
        {
            maxf=maxf<f?f:maxf;
        }
        for(int f:hs.values())
        {
            if(maxf==f)
            sum+=maxf;
        }
        return sum;
    }
}