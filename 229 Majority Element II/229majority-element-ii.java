class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1=0,c2=0;
        int cand1=-1,cand2=-1;
        for(int i: nums){
            if(cand1==i)
            c1++;
            else if(cand2==i)
            c2++;
            else if(c1==0)
            {cand1=i;
            c1++;}
            else if(c2==0)
            {
                cand2=i;
                c2++;
            }
            else{
                c1--;
                c2--;
            }
        }
        c1=0;c2=0;
        for(int a: nums)
        {
            if(cand1==a)
            c1++;
            else if(cand2==a)
            c2++;
        }
         int n=nums.length;
        ArrayList<Integer>result = new ArrayList<>();
        if(c1>n/3)
        result.add(cand1);
        if(c2>n/3)
        result.add(cand2);
        return result;
    }
}