package Sort;

import java.util.Arrays;

public class SelectionSort {


    public static void main(String[] args) {

        int [] arr = {2,3,4,5,1};
        selectionSort(arr);
        print(arr);

    }

    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length -1; i++) {
                int min = i;
            for (int j = i+1; j < arr.length ; j++) {

                if(isSmaller(arr,j,min)){
                    min = j;
                }
            }
            swap(arr,min,i);

        }
    }


    public static boolean isSmaller(int[] arr, int i, int j){
        return (arr[i] < arr[j]);
    }


    public static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int [] arr){
        System.out.println(Arrays.toString(arr));
    }

}

