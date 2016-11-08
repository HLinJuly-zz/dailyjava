public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0) return 0;
        int maxP = 0;
        int minP = Integer.MAX_VALUE;
        for(int price:prices){
            maxP = Math.max(maxP, price - minP);
            minP = Math.min(minP, price);
            
            
        }
        
        return maxP;
        
    }
}