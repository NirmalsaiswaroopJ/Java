import java.util.*;
public class Main{
    private static int BestTimeBuySellStock(int[] prices){
        int buy_price = prices[0];
        int maxprofit = 0;
        for(int i = 1; i<prices.length; i++){
            if(buy_price> prices[i]){
                buy_price = prices[i];
            } else{
                int currprofit = prices[i] - buy_price;
                maxprofit = Math.max(currprofit, maxprofit);
            }
        }
        return maxprofit;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the prices in the 7 days: ");
        int[] prices = new int[7];
        for(int i = 0; i<7; i++){
            prices[i] = sc.nextInt();
        }
        int ans = BestTimeBuySellStock(prices);
        System.out.println("Max Profit = "+ ans);
    }
}
// Here, we are able to perform buy and sell operations only once.
