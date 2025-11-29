public class BuyAndSellStockProblem {

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        int maxProfit = 0;
        int buyPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            int currentProfit = prices[i] - buyPrice;
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            } else if (currentProfit > 0) {
                continue;
            } else {
                buyPrice = prices[i];
            }
        }
        System.err.println(maxProfit);

    }
}