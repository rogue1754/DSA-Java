class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int target[]= new int[index.length];
        for(int i=0;i<target.length;i++)
        target[i]=-1;
        for(int j=0;j<index.length;j++){
        if(target[index[j]]!=-1)
        {
            target=shift(target,index[j]);
        }
        target[index[j]]=nums[j];
        }
        return target;
    }
         public int[] shift(int nums[],int start){
    int len=nums.length-1;
    while(len>start)
    nums[len]=nums[(len--)-1];
    return nums;
}
    }

   