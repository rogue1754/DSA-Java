class Solution {
    public int repeatedStringMatch(String a, String b) {
     //   int c = 1;
     //   Boolean t=false;String temp=a;
//while (a.length() < b.length()) {  
      //      a = a+temp;;
      //      c++;   
      //  }
       //  if (a.contains(b)) {
        //        t=true;
        //    }
          //  else if((a+temp).contains(b)) {
           //     t=true;
           //     c++;
         //   }     
       // return t?c:-1;
    int c = 1;
    boolean t = false;
    StringBuilder s= new StringBuilder(a);
    while (s.length() < b.length()) {
        s.append(a);
        c++;
    }
    if (s.toString().contains(b)) {
        return c;
    }
    s.append(a);
     if (s.toString().contains(b)) {
        t = true;
        c++;
    }
    return t ? c : -1;
}
}
    
