package com.blind.seventyfive;

public class BuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int d1 = 0; d1< prices.length; d1++) {
            if (prices[d1] < min ) min = prices[d1];
            if (prices[d1] - min > max) max = prices[d1] - min;
        }
        return max;
    }
}
