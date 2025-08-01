class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result= new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            List<Integer> temp= new ArrayList<>();
            long val=1;
            for(int j=0;j<=i;j++)
            {
              temp.add((int)val);
              val=val*(i-j);
              val=val/(j+1);
            }
            result.add(temp);
        }
        return result;
    }
}