class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> hs= new HashMap<>();
        int lc=0;
        int l=0;
        for(int r=0;r<fruits.length;r++)
        {
            hs.put(fruits[r],hs.getOrDefault(fruits[r],0)+1);
            while(hs.size()>2)
            {
                hs.put(fruits[l],hs.get(fruits[l])-1);
                if(hs.get(fruits[l])==0)
                   hs.remove(fruits[l]);
                   l++;
            }
            lc= Math.max(lc,r-l+1);
        }
        return lc;
    }
}