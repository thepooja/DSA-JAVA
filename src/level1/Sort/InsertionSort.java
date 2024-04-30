package level1.Sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {1,3,2};
        insertionSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length ; i++) {
            for (int j = i-1; j >=0 ; j--) {

                if(isGreater(arr,j+1,j))
                {
                 swap(arr,j,j+1);
                }
                else {
                    break;
                }
            }
        }
    }

    public static boolean isGreater(int [] arr, int i , int j){

        return (arr[i] < arr[j]);
    }


    public static void swap (int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }


}
