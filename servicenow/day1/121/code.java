class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int sum=0,p=0;
        for(int i=0;i<prices.length;i++){
            min=Math.min(prices[i],min);
            sum=prices[i]-min;
            if(sum>p)p=sum;
        }
       return p;
        
    }
}