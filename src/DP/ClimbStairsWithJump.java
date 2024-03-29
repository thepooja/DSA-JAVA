package DP;

import java.util.Scanner;

public class ClimbStairsWithJump {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int [] arr = new int[n];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = scanner.nextInt();
        }
        int [] dp = new int [n+1];
        dp[n] = 1;

        for (int i = n-1; i >=0 ; i--) {
            for (int j = 1; j <= arr[i] && i+j< dp.length ; j++) {
                dp[i] += dp[i + j];
            }
        }

        System.out.println(dp[0]);
    }
}
