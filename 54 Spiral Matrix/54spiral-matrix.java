class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> order= new ArrayList<>();
        int top=0,left=0,bottom=matrix.length-1,right=matrix[0].length-1;
        while(top<=bottom&&left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                order.add(matrix[top][i]);
            }
            top++;
            if(top>bottom)
            break;
            for(int i=top;i<=bottom;i++)
            {
                order.add(matrix[i][right]);
            }
            right--;
            if(left>right)
            break;
            for(int i=right;i>=left;i--)
            {
                order.add(matrix[bottom][i]);
            }
            bottom--;
            for(int i=bottom;i>=top;i--)
            {
                order.add(matrix[i][left]);
            }
            left++;
        }
        return order;
    }
}