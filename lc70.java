public class Solution {
    public int climbStairs(int n) {
        
        if(n<=2) return n;
        
        int step = 3;
        int s1 = 1;
        int s2 = 2;
        int tmp = 0;
        
        while(step<=n){
            tmp = s1+s2;
            s1 = s2;
            s2 = tmp;
            ++step;
            
            
            
        }
        return s2;
    }
}