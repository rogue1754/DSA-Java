class Solution {
    boolean bs(int [][]arr,int row,int cstart,int cend,int target)
    {
        int mid=0;
        while(cstart<=cend)
        {
             mid=cstart+(cend-cstart)/2;
             if(arr[row][mid]==target)
             return true;
             else if(arr[row][mid]<target)
             cstart=mid+1;
             else
             cend=mid-1;
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        if (rows == 1)
            return bs(matrix, 0, 0, cols - 1, target);
        int rstart = 0;
        int rend = matrix.length - 1;
        int mid = 0;
        int cmid = cols / 2;
        while (rstart < rend - 1) {
            mid = rstart + (rend - rstart) / 2;
            if (matrix[mid][cmid] == target)
                return true;
            else if (matrix[mid][cmid] > target)
                rend = mid;
            else
                rstart = mid;
        }
        if (matrix[rstart][cmid] == target || matrix[rstart + 1][cmid] == target)
    return true;


        if(bs(matrix,rstart,0,cmid-1,target))
        return true;

        if(bs(matrix,rstart+1,0,cmid-1,target))
        return true;
        
        if(bs(matrix,rstart,cmid+1,cols-1,target))
        return true;
        
        if(bs(matrix,rstart+1,cmid+1,cols-1,target))
        return true;
        return false;
    }
}