class Solution {
    public int maxProfit(int[] prices) {
        int cost = 0;
        int mini = prices[0];
        int maxprofit = 0;

        for(int i = 1; i < prices.length; i++){
            cost = prices[i] - mini;
            maxprofit = Math.max(maxprofit,cost);
mini = Math.min(prices[i],mini);

        }

        return maxprofit;
    }
}