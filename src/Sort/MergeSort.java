package Sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr ={7,4,1,3,8,6,2,5};
        int[] result = mergeSort(arr,0, arr.length-1);

        System.out.println(Arrays.toString(result));
    }


    public static int[] mergeSort(int[] arr, int low, int high){

        if(low == high){
            int [] b = new int[1];
            b[0] = arr[low];
            return b;
        }
        int mid = (low+high) /2;
        int[] fsh = mergeSort(arr,low,mid);
        int[] ssh = mergeSort(arr, mid+1,high);
        return mergeTwoSortedArrays(fsh,ssh);
    }
    public static int[] mergeTwoSortedArrays(int[] a, int[] b){
        int[] res = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i< a.length && j < b.length){
            if(a[i] < b[j]){
                res[k] = a[i];
                k++;
                i++;
            }
            else {
                res[k] = b[j];
                k++;
                j++;
            }
        }

        while (i< a.length) {
            res[k] = a[i];
            k++;
            i++;
        }

        while (j < b.length){
            res[k] = b[j];
            k++;
            j++;
        }


        return res;
    }

}
