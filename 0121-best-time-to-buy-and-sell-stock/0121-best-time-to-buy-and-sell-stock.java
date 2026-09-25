class Solution {
    public int maxProfit(int[] prices) {
        int buyprice=prices[0],maxpf=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buyprice){
                buyprice=prices[i];
            }else{
                int profit=prices[i]-buyprice;
                maxpf=Math.max(profit,maxpf);
            }
        }return maxpf;
    }
}