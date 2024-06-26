class Solution {
    public int romanToInt(String s) {
        int arr[]= new int[]{1,5,10,50,100,500,1000};
        String a="IVXLCDM";
        int sum=0,i=0;
        for(i=s.length()-1;i>0;i--)
        {
            int b= a.indexOf(s.charAt(i));
            sum=sum+ arr[b];
            if(s.charAt(i-1)=='I' && (s.charAt(i)=='V' || s.charAt(i)=='X'))
            {
            --sum;i--;
            }
            else if(s.charAt(i-1)=='X' && (s.charAt(i)=='L' || s.charAt(i)=='C'))
            {i--;
            sum-=10;}
            else if(s.charAt(i-1)=='C' && (s.charAt(i)=='D' || s.charAt(i)=='M'))
            {i--;
            sum-=100;}
        }
        if(i==0)
        sum=sum+arr[a.indexOf(s.charAt(0))];
        return sum;
    }
}