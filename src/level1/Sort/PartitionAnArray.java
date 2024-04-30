package level1.Sort;

import java.util.Arrays;

public class PartitionAnArray {

    public static void main(String[] args) {

        int nums[] = {9,12,5,10,14,3,10};
        int pivot = 10;
        partitionArray(nums,pivot);
        System.out.println(Arrays.toString(nums));
    }


    public static void partitionArray(int arr[], int pivot) {

        int i = 0;
        int j = 0;

        while (i < arr.length) {
            if (arr[i] < pivot) {
                swap(arr,i,j);
                i++;
                j++;
            } else {
               i++;
            }
        }
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
