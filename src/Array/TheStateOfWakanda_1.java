package Array;

import java.util.Scanner;

// print 2D array in wave pattern
public class TheStateOfWakanda_1 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int row = scn.nextInt();
        int col = scn.nextInt();

        int[][] arr = new int[row][col];

        // Input 2D Array
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col; j++) {

                arr[i][j] = scn.nextInt();
            }
        }


        // Column
        for (int i = 0; i <arr[0].length ; i++) {

            // If Even then increase row
            if (i%2 ==0)
            {
                for (int j = 0; j < arr.length ; j++) {

                    System.out.println(arr[j][i]);
                }
            }

            // Else decrease row
            else {
                for (int j = arr.length-1;j>=0;j--)
                {
                    System.out.println(arr[j][i]);
                }
            }
        }


    }
}
