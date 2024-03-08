package DP;

public class CoinChangePermutation {

    public static void main(String[] args) {

        int coins[] = {1,2,5};
        int amount = 5;


        int per = coinPerm(coins,amount);

        System.out.println("Permutations for amouunt : "+amount +" is :--> "+per) ;
    }

    private static int coinPerm(int [] coins, int amount){

        int [] dp = new int[amount+1];
        dp[0] = 1;
        for (int i = 0; i < dp.length ; i++) {

            for (int j = 0; j <coins.length ; j++) {
                if(coins[j] <= i) {
                    dp[i] += dp[i - coins[j]];
                }
            }
        }


        return dp[amount];
    }
}
