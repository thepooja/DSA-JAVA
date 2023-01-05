package Array;

import java.util.ArrayList;
import java.util.List;

public class SprialDisplayLeet {

    public static void main(String[] args) {
        SprialDisplayLeet sdl = new SprialDisplayLeet();
        int arr[][] = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        List<Integer> result = sdl.spiralOrder(arr);
        for(int e:result){
            System.out.print(e+"\t");
        }

    }

    private List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<Integer>();

        int minrow = 0;
        int mincol = 0;
        int maxrow = matrix.length - 1;
        int maxcol = matrix[0].length - 1;

        int tne = matrix.length * matrix[0].length;
        int count = 0;


        while (count < tne) {

            // top wall
            for (int i = minrow, j = mincol; j <= maxcol && count < tne; j++) {
                result.add(matrix[i][j]);
                count++;
            }
            minrow++;

            // right wall
            for (int i = minrow, j = maxcol; i <= maxrow && count < tne; i++) {
                result.add(matrix[i][j]);
                count++;
            }
            maxcol--;


            // bottom wall
            for (int i = maxrow, j = maxcol; j >= mincol && count < tne; j--) {
                result.add(matrix[i][j]);
                count++;
            }
            maxrow--;

            // left wall

            for (int i = maxrow, j = mincol; i >= minrow && count < tne; i--) {
                result.add(matrix[i][j]);
                count++;
            }
            mincol++;
        }
        return result;
    }
}

