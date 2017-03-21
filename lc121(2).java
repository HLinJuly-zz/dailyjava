public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0) return 0;
        int maxp=0;
        int minp=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            maxp=Math.max(maxp,prices[i]-minp);
            minp=Math.min(minp,prices[i]);
            
        }
        return maxp;
    }
}