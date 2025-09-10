class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;

         for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                profit+= prices[i]-prices[i-1];
            }
        }
        return profit;    
    }    
}

//the logic

prices = [1,2,3,4,5]
(2-1) +(3-2)+(4-3)+(5-4)
1 + 1 + 1 + 1 = 4

prices = [7,1,5,3,6,4]
(1-7)+(5-1)+(3-5)+(6-3)+(4-6)
(-6) + 4 + (-2) + 3 + (-2) // ignore all negative
4+3 = 7
