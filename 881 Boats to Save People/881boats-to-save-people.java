class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int a[]= new int[limit+1];
        for(int i:people)
        a[i]++;
        int l=1,h=limit,c=0;
        while(l<=h)
        {
            while(l<=h&&a[h]==0)
            h--;
            if(l>h)
            break;
            int remain=limit-h;
            a[h]--;
            while(l<=h&&a[l]==0)
            l++;
             if(l<=remain)
             a[l]--;
             c++;
        }
        return c;
    }
}