class Solution {
    public int maxProfit(int[] prices) {
        int minimumSellAmount=prices[0];
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minimumSellAmount){
                minimumSellAmount=prices[i];
            }
            profit=Math.max(profit,prices[i]-minimumSellAmount);
        }
        return profit;
    }
}