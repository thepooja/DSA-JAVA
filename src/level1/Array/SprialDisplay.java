package level1.Array;

import java.util.Scanner;

public class SprialDisplay {

    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][]arr = new int[n][m];

        // Input level1.Array
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                arr[i][j] = scn.nextInt();
            }
        }


        int minrow = 0;
        int mincol = 0;
        int maxrow = arr.length-1;
        int maxcol = arr[0].length-1;

        int tnt = n*m;

        int count = 0;

        while (count<=tnt)
        {
            // left wall

            for (int i = minrow, j=mincol;i <=maxrow && count<tnt; i++) {
                System.out.println(arr[i][j]);
                count++;
            }

            mincol++;
            // bottom wall
            for (int i = maxrow,j=mincol; j<=maxcol && count<tnt; j++) {

                System.out.println(arr[i][j]);
                count++;
            }

            maxrow --;
            // right wall
            for (int i = maxrow,j=maxcol; i >= minrow && count<tnt; i--) {
                System.out.println(arr[i][j]);
                count++;
            }

            maxcol--;

            // top wall
            for (int i = minrow,j=maxcol; j>=mincol && count<tnt; j--) {
                System.out.println(arr[i][j]);
                count++;
            }

            minrow++;
        }



    }
}
