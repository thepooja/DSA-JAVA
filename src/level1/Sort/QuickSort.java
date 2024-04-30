package level1.Sort;


import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {5,2,3,1,8,7,9,6};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }


    public static void quickSort(int[] arr, int lo, int hi) {
        if(lo > hi){
            return;
        }
        int pivot = arr[hi];
        int pi = partition(arr,pivot,lo,hi);
        quickSort(arr,lo,pi-1);
        quickSort(arr,pi+1,hi);

    }

    public static int partition(int[] arr, int pivot, int lo, int hi) {
        int i = lo, j = lo;

        while (i <= hi) {

            if (arr[i] <= pivot) {
                swap(arr, i, j);
                i++;
                j++;
            } else {
                i++;
            }
        }


        return (j - 1);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
