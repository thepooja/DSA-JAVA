package level1.DP;

import java.util.Scanner;

public class ClimbStairs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int dp = countStairs(n, new int[n + 1]);
        System.out.println(dp);

    }

    // using level1.DP Memoization
    private static int countStairs(int n, int[] qb) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 0;
        }
        int dp1 = countStairs(n - 1, qb);
        int dp2 = countStairs(n - 2, qb);
        int dp3 = countStairs(n - 3, qb);

        int count = dp1 + dp2 + dp3;
        qb[n] = count;
        return count;

    }

    // using level1.DP Tabulation

    private static int countSteps(int n){
        int[] dp = new int[n+1];
        dp[0] = 1;
        for (int i =1;i <= n ;i++){
            if(n == 1){
                dp[i] = dp[i-1];
            } else if (n == 2) {
                dp[i] = dp[i-1]+dp[i-2];
            }
            else{
                dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
            }
        }


        return dp[n];
    }
}
