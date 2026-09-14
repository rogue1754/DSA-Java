class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int buy=prices[0];
        int i=0;
        while(i<prices.length-1)
        {
            if(prices[i]>prices[i+1])
            { 
              profit+=(prices[i]-buy);
              buy=prices[i+1];
            }
            i++;
        }
        return profit+(prices[i]-buy);
    }
}