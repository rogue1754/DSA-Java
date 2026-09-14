class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> hs= new HashMap<>();
        hs.put(0,1);
        int c=0;
        int sums=0;
        for(int i:nums){
            sums+=i;
            if(hs.containsKey(sums-k)&&hs.get(sums-k)>0)
            c+=hs.get(sums-k);
            hs.put(sums,hs.getOrDefault(sums,0)+1);
        }
        return c;
    }
}