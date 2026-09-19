class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int Pmax = 0;
        while (l < r) {
            int product = (r - l) * Math.min(height[r], height[l]);
            Pmax = Pmax < product ? product : Pmax;
            if(height[r]>height[l])
            l++;
            else
            r--;
        }
        return Pmax;
    }
}