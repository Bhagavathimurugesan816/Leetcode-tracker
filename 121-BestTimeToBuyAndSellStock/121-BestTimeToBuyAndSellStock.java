// Last updated: 14/07/2026, 14:13:43
class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit =0;
        for(int i=0; i< prices.length; i++){
            min = Math.min(min, prices[i]);
            profit = Math.max(profit, prices[i] - min);
        }
        return profit;
    }
}