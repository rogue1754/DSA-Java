class Solution {
    public int[] sortArray(int[] nums) {
     mergesort(nums,0,nums.length-1);
     return nums;
    }
    public static void mergesort(int arr[],int i,int j)
    {
        if(i>=j) return ;
        int mid=(i+j)/2;
        
        mergesort(arr,i,mid);   
        mergesort(arr,mid+1,j);
         conquer(arr,i,mid,j);
    }
    public static void conquer(int arr[],int i,int mid,int j)
    {
        int[] temp= new int[j-i+1];
        int index=i;
        int index2=mid+1;
        int x=0;
        while(index<=mid&&index2<=j)
        {
            if(arr[index]<=arr[index2])
            {
                temp[x]=arr[index];
                x++;index++;
            }
            else 
            {
                temp[x]=arr[index2];
                x++;index2++;
            }
         
        }
        while(index<=mid)
        {
            temp[x++]=arr[index++];
        }
        
        while(index2<=j)
        {
            
            temp[x++]=arr[index2++];
        }
        for (int u = 0; u < temp.length; u++) {
            arr[i + u] = temp[u];
        }
    }
    
}