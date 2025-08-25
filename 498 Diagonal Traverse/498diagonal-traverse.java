class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int row=0;
        int col=0;
        int dindex=0;
        int result[]= new int[m*n];
        int index=0;
        while(dindex<(m+n-1))
            {
                
                if(dindex%2==0)
                { int t=0;
                 row=Math.min(dindex,m-1);
                col=dindex-row;
                    while(row>=0&&col<n)
                        {
                            result[index++]=mat[row--][col++];
                        }
                }
                else
                {
                    col=Math.min(dindex,n-1);
                    row=dindex-col;
                    while(col>=0&&row<m)
                        {
                            result[index++]=mat[row++][col--];
                        }
                }
                dindex++;  
            }
        return result;
    }
}