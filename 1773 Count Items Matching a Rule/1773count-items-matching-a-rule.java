class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        HashMap<String,Integer> a= new HashMap<>();
         a.put("type",0);
         a.put("color",1);
         a.put("name",2);
         int c=0;
         for(List b:items)
         {
            if(b.get(a.get(ruleKey)).equals(ruleValue))
            c++;
         }
         return c;
    }
}