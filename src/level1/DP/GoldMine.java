package level1.DP;

public class GoldMine {
    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] g = new int[n][m];

        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g[0].length; j++) {
                g[i][j] = scanner.nextInt();
            }
        }*/
        int[][] g = {
                {0, 6, 0},
                {5, 8, 7},
                {0, 9, 0}
        };

        boolean[][] visited = new boolean[g.length][g[0].length];
        int max = 0;
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g[0].length; j++) {
                if (g[i][j] != 0) {
                    int sum = goldmine(g, i, j, visited);
                    if (sum > max) {
                        max = sum;
                    }
                }
            }
        }
        System.out.println(String.format("Max gold that can be collected is %d", max));
    }


    private static int goldmine(int[][] arr, int row, int col, boolean[][] visited) {

        if (row < 0 || col < 0 || row == arr.length || col == arr[0].length || arr[row][col] == 0 || visited[row][col]) {
            return 0;
        }


        visited[row][col] = true;
        //top
        int north = goldmine(arr, row - 1, col, visited);
        // left
        int east = goldmine(arr, row, col - 1, visited);
        // right
        int west = goldmine(arr, row, col + 1, visited);
        // down
        int south = goldmine(arr, row + 1, col, visited);

        int sum = arr[row][col] + Math.max(Math.max(south, north), Math.max(west, east));
        visited[row][col] = false;

        return sum;
    }
}


/*
*     pepcoding code ------
*
*
        for (int j = arr[0].length -1; j >=0 ; j--) {
            for (int i = arr.length -1; i >=0 ; i--) {
                // last column
                if( j == arr[0].length-1){
                    dp[i][j] = arr[i][j];
                }
                // last row
                else if (i == arr.length-1) {
                    dp[i][j] = arr[i][j]+Math.max(dp[i][j+1],dp[i-1][j+1]);
                }
                // first row
                else if (i == 0) {
                    dp[i][j] = arr[i][j]+Math.max(dp[i][j+1],dp[i +1][j+1]);
                }
                // remaining box
                else {
                    dp[i][j] = arr[i][j]+Math.max(dp[i][j+1],Math.max(dp[i-1][j+1],dp[i+1][j+1]));
                }

            }
        }

        int max = dp[0][0];

        for (int i = 1; i <dp.length ; i++) {
            if(dp[i][0] > max){
                max = dp[i][0];
            }
        }

        System.out.println(max);
    }

* */