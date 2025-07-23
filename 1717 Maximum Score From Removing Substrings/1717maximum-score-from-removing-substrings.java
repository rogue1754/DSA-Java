class Solution {
    private int points=0;
    public int maximumGain(String s, int x, int y) {
        if(x>=y)
        {
           s= rem(s,"ab",x);
            s=rem(s,"ba",y);
           
        }
        else
        {
           s= rem(s,"ba",y);
            s=rem(s,"ab",x);    
        }
         return this.points;
    }
    public String rem(String s,String x,int t)
    {
        StringBuilder sb= new StringBuilder();
        int i=0;
        int p=0;
        
         while(i<s.length()){
            int len =sb.length();
             if(len>0 && sb.charAt(len-1)==x.charAt(0) && s.charAt(i)==x.charAt(1) ){
                sb.deleteCharAt(len-1);
                p+=t;
             }
             else
             {sb.append(s.charAt(i));}
             i++;
        }
        this.points+=p;
        return sb.toString();
    }  
}
// class Solution {
//     private int points = 0;

//     public int maximumGain(String s, int x, int y) {
//         if (x >= y) {
//             s = rem(s, "ab", x);
//             s = rem(s, "ba", y);
//         } else {
//             s = rem(s, "ba", y);
//             s = rem(s, "ab", x);
//         }
//         return this.points;
//     }

//     public String rem(String s, String pattern, int value) {
//         StringBuilder sb = new StringBuilder();
//         for (int i = 0; i < s.length(); i++) {
//             sb.append(s.charAt(i));
//             int len = sb.length();
//             if (len >= 2 && sb.charAt(len - 2) == pattern.charAt(0) && sb.charAt(len - 1) == pattern.charAt(1)) {
//                 sb.delete(sb.length() - 2, sb.length());
//                 this.points += value;
//             }
//         }
//         return sb.toString();
//     }
// }
