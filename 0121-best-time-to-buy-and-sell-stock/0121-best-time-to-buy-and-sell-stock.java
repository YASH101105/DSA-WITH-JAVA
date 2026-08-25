class Solution {
    public int maxProfit(int[] prices) {
        int start = prices[0];
        int maxprofit =0;
        while(prices==null||prices.length<2){
            return 0;
        }
        for(int i =1;i<prices.length;i++){
            if(prices[i]<start){
                start = prices[i];// change the value of start in which the minimum value is going to have 
        }
        else{
            maxprofit = Math.max(maxprofit, prices[i] - start);
        }
    
    
            
         

    }
    return maxprofit; 
   
}
}