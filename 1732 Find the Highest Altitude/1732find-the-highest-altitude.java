class Solution {
    public int largestAltitude(int[] gain) {
        int a[]= new int[gain.length+1];
        int max=0;
        for(int i=1;i<a.length;i++)
        {
            a[i]=a[i-1]+gain[i-1];
            max=a[i]>max?a[i]:max;
        }
        return max;
    }
}