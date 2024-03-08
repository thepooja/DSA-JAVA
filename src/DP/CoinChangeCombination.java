package DP;

import java.util.Scanner;

public class CoinChangeCombination {

    public static void main(String[] args) {

        /*Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = s.nextInt();
        }

        int amt = s.nextInt();*/
        int [] coins = new int[]{1,2,5};
        int amt = 10;
        int[] dp = new int[amt + 1];

        dp[0] = 1;

        for (int coin = 0; coin < coins.length; coin++) {
            for (int currentWay = coins[coin]; currentWay < dp.length; currentWay++) {
                dp[currentWay] += dp[currentWay - coins[coin]];
            }
        }
        System.out.println(dp[amt]);
    }
}
