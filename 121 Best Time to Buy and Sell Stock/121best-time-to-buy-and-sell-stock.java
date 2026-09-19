class Solution {
    public int maxProfit(int[] prices) {
        int pmax=0,min=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            pmax=pmax<(prices[i]-min)?prices[i]-min:pmax;
            min=min>prices[i]?prices[i]:min;
        }
        return pmax;
    }
}