class Solution {
    public int[][] generateMatrix(int n) {
        int arr[][]= new int[n][n];
        int top=0,bottom=n-1,right=n-1,left=0,c=1;
        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                arr[top][i]=c++;
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                arr[i][right]=c++;
            }
            right--;
            for(int i=right;i>=left;i--)
            {
                arr[bottom][i]=c++;
            }
            bottom--;
            for(int i=bottom;i>=top;i--)
            {
                arr[i][left]=c++;
            }
            left++;
        }
        return arr;
    }
}