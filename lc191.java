public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        while (n!=0){
            count += n&1;
            n>>>=1;
            
            
        }
        
        return count;
        
    }
}


public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1); // clear the last 1 bit
            ++count;
        }
        return count;
    }
}