class Solution {
private boolean containsnozero(int n){
        int num=n;
        while(num>0){
            int temp = num % 10;
            if(temp==0){
                return false;
            } 
            num/=10;
        }
        return true;
    }
    public int[] getNoZeroIntegers(int n) {
        int ar[] = new int[2];
        for(int i = 1; i<n; i++){
            int a = i;
            int b = n-i;
            if(containsnozero(a) && containsnozero(b)){
                ar[0]=a;
                ar[1]=b;
                break;
            }
        }
        return ar;
    }
}