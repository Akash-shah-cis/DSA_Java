package ImpQuestions;

public class BuySellStocks {
    public static int maxProfit(int[] prices) {
        int MaxProfit = 0;
        
        int buyStock = prices[0];
       

        for(int i=1;i<prices.length;i++){
           int sellStock = prices[i];
            if(sellStock>buyStock){
                int profit  =  sellStock-buyStock;
                MaxProfit  = Math.max(MaxProfit,profit);
            }
            else{
            buyStock = sellStock;
            }
        }
        return MaxProfit;
    }
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
