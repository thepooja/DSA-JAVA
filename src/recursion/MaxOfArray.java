package recursion;

import java.util.Scanner;

public class MaxOfArray {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

       int max= maxofArray(arr, 0);
        System.out.println(max);

    }

    private static int maxofArray(int arr[],int index){

        if(index >= arr.length){
            return Integer.MIN_VALUE;
        }

        int misa = maxofArray(arr,index+1);

        if(arr[index] > misa){
            return arr[index];
        }
        return misa;
    }
}
