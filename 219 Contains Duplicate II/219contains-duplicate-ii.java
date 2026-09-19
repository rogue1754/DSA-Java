class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int l=0;l<nums.length;l++) {
           if(l>k)
           set.remove(nums[l-k-1]);
           if(!set.add(nums[l]))
           return true;
        }
        return false;
    }
}