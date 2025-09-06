class Solution {
    public int maxProfit(int[] prices) {

      // Initialize the min with the MAX value
        int min = Integer.MAX_VALUE;
      //Initialize a maxprofit 
        int maxprofit = 0;

        for(int i=0;i<prices.length;i++){
           // Update min if we find a smaller price
            if(min >prices[i]){
                min = prices[i];
         
          // Otherwise, check if selling at current price gives higher profit
            }else if(prices[i]-min > maxprofit){
                maxprofit = prices[i]-min;
            }
        }
        return maxprofit;
        
    }
}
