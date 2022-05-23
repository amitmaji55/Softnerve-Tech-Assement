package com.company;

import java.util.*;

class BuySellStock {

    static int findMaximumProfit(int[] prices, int i, int k,
                                 int buy, int[][] v) {
        if (i >= prices.length || k <= 0)
            return 0;

        if (v[i][buy] != -1)
            return v[i][buy];

        int nbuy;
        if (buy == 1)
            nbuy = 0;
        else
            nbuy = 1;
        if (buy == 1) {
            return v[i][buy] = Math.max(
                    -prices[i]
                            + findMaximumProfit(
                            prices, i + 1, k, nbuy, v),
                    findMaximumProfit(prices, i + 1, k,
                            (int) (buy), v));
        } else {


            if (buy == 1)
                nbuy = 0;
            else
                nbuy = 1;
            return v[i][buy]
                    = Math.max(
                    prices[i]
                            + findMaximumProfit(prices, i + 1,
                            k - 1, nbuy, v),
                    findMaximumProfit(prices, i + 1, k, buy,
                            v));
        }
    }

    static int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] v = new int[n][2];

        for (int i = 0; i < v.length; i++) {
            v[i][0] = -1;
            v[i][1] = -1;
        }

        return findMaximumProfit(prices, 0, 1, 1, v);
    }


    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        int ans = maxProfit(prices);

        System.out.println(ans);
    }
}
