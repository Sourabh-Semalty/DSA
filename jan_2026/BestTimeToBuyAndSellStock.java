public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;
        int maxProfit = 0;
        int currentBuy = prices[0];
        for (int day = 0; day < prices.length - 1; day++) {
            int nextBuy = prices[day + 1];
            if (nextBuy < currentBuy) {
                currentBuy = nextBuy;
            } else {
                maxProfit = Math.max(maxProfit, nextBuy - currentBuy);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int maxProfit = solution.maxProfit(prices);
        System.out.println("Maximum profit: " + maxProfit);
    }
}
