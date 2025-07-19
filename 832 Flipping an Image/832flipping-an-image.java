class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int m=image.length;
        for(int i=0;i<m;i++)
        {  int c=m-1;
            for(int j=0;j<=c;j++)
            {
                 int temp =image[i][j];
                 image[i][j]=image[i][c];
                 image[i][c]=temp;
                 image[i][j]^=1;
                 image[i][c]^=1;
                 
                 if(j==c)
                 image[i][c]^=1;
                 c--;
            }
            
        }
        return image;
    }
}