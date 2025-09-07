class Solution {
    public int[] sumZero(int n) {
        int arr[] = new int[n]; int i=0;
        boolean check = false;
        //checks if n is odd or even
        if(n%2==0){
            check = true;
        }
        
        if(!check){ // if odd then  0 andar krdo 
            arr[i]=0;
            i++;
        }
        
        //filling the array
        for(int j=i;j<arr.length;j++){
            arr[j++]=n/2;
            arr[j]=-(n/2);
            n+=2;
        }
        
        return arr;
    }
}