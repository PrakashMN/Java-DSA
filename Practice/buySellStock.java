public class buySellStock {

    public static int buysell(int[] price){
        int bp = Integer.MAX_VALUE;
        int mp = 0;
        for(int i=0;i<price.length;i++){
            if(bp<price[i]){
                int profit = price[i]-bp;
                mp = Math.max(profit, mp);
            }else {
                bp = price[i];
            }
        }

        return mp;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(buysell(prices));
    }
}
