//Optimized
// Tried Third

class Solution {
    public int maxProfit(int[] prices) {

        int min =Integer.MAX_VALUE;
        int maxprofit =0;

        for(int i=0;i<prices.length;i++){
           if(min<prices[i]){
                if(prices[i]-min>maxprofit){
                    maxprofit=prices[i]-min;
                }
           }else{
            min = prices[i];
           }
        }
        return maxprofit;

    }
}

// Tried Second

class Solution {
    public int maxProfit(int[] prices) {

        int min =Integer.MAX_VALUE;
        int maxprofit =0;

        for(int i=0;i<prices.length;i++){
            min = Math.min(min,prices[i]);
            maxprofit = Math.max(prices[i]-min,maxprofit);
        }
        return maxprofit;

    }
}


// Tried First Time
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



