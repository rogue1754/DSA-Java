class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxlen=0;
        int area=0;
        for(int arr[]: dimensions)
        {
            int templen=(arr[0]*arr[0])+(arr[1]*arr[1]);
            int temparea=arr[1]*arr[0];
            if(templen>maxlen)
            {
                maxlen=templen;
                area=temparea;
            }
            else if(templen==maxlen)
            {
                area=Math.max(area,temparea);
            }
        }
        return area;
    }
}