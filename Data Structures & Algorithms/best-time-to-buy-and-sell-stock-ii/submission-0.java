class Solution {
    public int maxProfit(int[] prices) {
    int profit=0;
    int cheapest=999999;
    for(int i=0;i<prices.length;i++){
        if(cheapest>prices[i]){
            cheapest=prices[i];
        }
        else{
            profit=profit+(prices[i]-cheapest);
            cheapest=prices[i];
        }
    }  
    return profit;
    }
}