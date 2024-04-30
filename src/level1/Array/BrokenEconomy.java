package level1.Array;

import java.util.Scanner;

public class BrokenEconomy {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n= scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length ; i++) {

            arr[i] = scanner.nextInt();
        }

        int low = 0;
        int high = arr.length-1;

        int data = scanner.nextInt();

        int ceil = 0;
        int floor = 0;
        while (low <= high)
        {
            int mid = (low+high)/2;
            if(data <= arr[mid])
            {
                high = mid -1;
                ceil = arr[mid];
            }
            else if(data >= arr[mid])
            {
                low = mid+1;
                floor = arr[mid];
            }
            else {
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }
        }

        System.out.println(ceil);
        System.out.println(floor);


    }
}
