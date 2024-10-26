//A coding problem to find the maximum profit from buying and selling a stock on different days. Given an array of prices, return the best buy and sell dates and the profit


public class buyandSellStock {
    public static int buyandsellstock(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                int profit = prices[i]-buyPrice;
                maxprofit = Math.max(maxprofit, profit);
            }else{
                buyPrice = prices[i];
            }
        }

        return maxprofit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(buyandsellstock(prices));
    }
}
