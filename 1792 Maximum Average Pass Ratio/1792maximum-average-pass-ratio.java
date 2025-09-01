class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> pt= new PriorityQueue<>( (a, b) -> Double.compare(b[0], a[0]));
        for(int i=0;i<classes.length;i++)
        {
            double a=classes[i][0];
            double b=classes[i][1];
            double diff=((a+1)/(b+1))-(a/b);
            pt.add(new double[]{diff,a+1,b+1});
        }
        while(extraStudents>0)
        {
            double[] i=pt.poll();
            double a=i[1];
            double b=i[2];
           double diff=((a+1)/(b+1))-(a/b);
             pt.add(new double[]{diff,a+1,b+1});
             extraStudents--;
        }
        double sum=0.0;
         while(!pt.isEmpty())
         {
            double[] i = pt.poll();
            sum+=(i[1]-1)/(i[2]-1);
         }
         return sum/classes.length;
    }
}