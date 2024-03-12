package Sort;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int [] arr = {5,9,8,2,1};
        bubbleSort(arr);
        print(arr);

    }

    public static void  bubbleSort(int [] arr){

        for (int i = 1; i <=arr.length-1 ; i++) {
            for (int j = 0; j < arr.length-i ; j++) {
                if(isSmaller(arr,j+1,j)){
                    swap(arr,j+1,j);
                }
            }
        }

    }
    // used for swapping elements
    public static void swap (int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static boolean isSmaller(int[] arr, int i, int j){
        return arr[i] < arr[j];
    }

    public static void print(int [] arr){
        System.out.println(Arrays.toString(arr));
    }
}
