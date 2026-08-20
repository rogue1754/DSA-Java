class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> anagrams = new HashMap<>();
        for(String e:strs)
        {
            char arr[]= e.toCharArray();
            Arrays.sort(arr);
            String sorted=new String(arr);
            anagrams.computeIfAbsent(sorted, k->new ArrayList<>()).add(e);
        
    }
        return new ArrayList<>(anagrams.values());
}
}