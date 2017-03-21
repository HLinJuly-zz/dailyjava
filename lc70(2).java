public class Solution {
    public int climbStairs(int n) {
        int n1=0;
        int n2=1;
        int s=0;
        for(int i=0;i<n;i++){
            s=n1+n2;
            n1=n2;
            n2=s;
        }
        return s;
    }
}