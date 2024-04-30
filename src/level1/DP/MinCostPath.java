package level1.DP;

import java.util.Scanner;
/*  1. You are given n*m numbers, representing elements of 2d array a,
which represents a maze.
2. You are standing in top-left cell and are required to move to bottom-right cell.
3. You are allowed to move 1 cell right (h move) or 1 cell down (v move) in 1 motion.
4. You are required to traverse through the matrix and print the cost of path which is least costly.
 * */
public class MinCostPath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // row
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int [][] arr = new int[n][m];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[0].length ; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        // we have to found minimum cost for travel the
            int [][] dp = new int[n][m];
        for (int i = dp.length-1; i >=0 ; i--) {
            for (int j = dp[0].length-1; j >=0 ; j--) {
                // for last position
                if(i == dp.length-1 && j == dp[0].length-1){
                    dp[i][j] = arr[i][j];
                }
                // for last row
                else if (i == dp.length-1) {
                    dp[i][j] = dp[i][j+1] + arr[i][j];
                }
                // for last column
                else if (j == dp[0].length-1) {
                    dp[i][j] = dp[i +1 ][j] + arr[i][j];
                }
                // for other area
                else {
                    dp[i][j] = Math.min(dp[i+1][j],dp[i][j+1])+arr[i][j];
                }
            }
        }

        System.out.println(dp[0][0]);
    }
}
