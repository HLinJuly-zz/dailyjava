public class Solution {
    public int arrangeCoins(int n) {
        /* 
        (1+k)*k/2 = n
        k+k*k = 2*n
        k*k + k + 0.25 = 2*n + 0.25
        (k + 0.5) ^ 2 = 2*n +0.25
        k + 0.5 = sqrt(2*n + 0.25)
        k = sqrt(2*n + 0.25) - 0.5
        */
        return (int)(Math.sqrt(2*(long)n+0.25)-0.5);
    }
}