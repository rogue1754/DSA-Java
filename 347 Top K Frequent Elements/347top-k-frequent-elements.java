class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         HashMap<Integer,Integer> hs= new HashMap<>();
         for(int a:nums)
         {
            hs.put(a,hs.getOrDefault(a,0)+1);
         }
         int n= nums.length;
         ArrayList<Integer>[] bucket= new ArrayList[n+1];
         for(int i=0;i<bucket.length;i++)
         {
            bucket[i]=new ArrayList<>();
         }
         for(int i: hs.keySet())
         {
            int f=hs.get(i);
            bucket[f].add(i);
         }
         List<Integer> result= new ArrayList<>();
         for(int i=bucket.length-1;i>=0;i--)
         {
            if(result.size()>=k)
            break;
            if(!bucket[i].isEmpty())
            result.addAll(bucket[i]);
         }
         return result.stream().mapToInt(i->i).limit(k).toArray();  
    }
}