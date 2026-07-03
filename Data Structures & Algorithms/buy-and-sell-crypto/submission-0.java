class Solution {
    public int maxProfit(int[] prices) {
        int minC = Integer.MAX_VALUE;
        int profit = Integer.MIN_VALUE;

        for(int i : prices){
            if(i < minC) minC = i;

            profit = Math.max(profit, i - minC);
        }
        return profit;
    }
}
