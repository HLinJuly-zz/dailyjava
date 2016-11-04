public class Solution {
    public boolean isPowerOfTwo(int n) {
     //  double logAns = log10(n) / log10(2);
       // return (logAns - int(logAns) == 0) ? true : false;
        
        
        return n>0&&(n&(n-1))==0;
    }
}