public class Solution {
    public boolean isPowerOfThree(int n) {
        double logAns = Math.log10(n) / Math.log10(3);
        return (logAns - Math.round(logAns) == 0) ? true : false;
    }
}