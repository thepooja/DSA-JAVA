package Array;

import java.util.Scanner;
/*Example

Find first & last occurrence of 33 in the given array:

Array a = {1, 5, 10, 15, 22, 33, 33, 33, 33, 33, 40, 42, 55, 66, 77}.

Hence, the answer will be 5 and 9 respectively (0-based indexing).*/
public class FirstAndLastIndex {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i <n ; i++) {

            arr[i] = scn.nextInt();
        }

        int low = 0;
        int high = arr.length-1;

        int data = scn.nextInt();

        int fi =-1, li =-1;

        // For First Index
        while (low <= high)
        {

            int mid = (low+high)/2;
            if (data < arr[mid])
            {
                high = mid -1;

            }else if (data > arr[mid])
            {
                low = mid+1;
            }
            else {

                fi = mid;
                high =  mid -1;
            }
        }


        System.out.println("First Index "+fi);
        // for Last Index
         low = 0;
        high = arr.length-1;

        while (low <= high)
        {

            int mid = (low+high)/2;
            if (data < arr[mid])
            {
                high = mid -1;

            }else if (data > arr[mid])
            {
                low = mid+1;
            }
            else {

                li = mid;
                low =  mid +1;
            }
        }

        System.out.println("Last Index "+li);
    }
}
