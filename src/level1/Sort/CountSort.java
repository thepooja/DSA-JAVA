package level1.Sort;

import java.util.ArrayList;
import java.util.Arrays;

public class CountSort {

    public static void main(String[] args) {

        int[] arr = {9,6,3,5,3,4,3,9,6,4,6,5,8,9,9};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        countS(arr, min, max);
    }


    public static void countS(int[] arr, int min, int max) {
        int range = max - min +1;

        int[] farr = new int[range];

        for (int i = 0; i <arr.length ; i++) {
            int ide = arr[i] - min;
            farr[ide]++;
        }

        for (int i = 1; i < farr.length ; i++) {
            farr[i] = farr[i] + farr[ i -1];
        }

        int [] ans = new int[arr.length];

        for (int i = arr.length - 1; i > 0 ; i--) {
            int val = arr[i];
            int pos = farr[val - min];
            int idx = pos - 1;
            ans[idx] = val;
            farr[ val - min] --;
        }

        System.out.println(Arrays.toString(ans));
    }
}
