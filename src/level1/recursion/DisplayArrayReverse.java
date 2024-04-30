package level1.recursion;

import java.util.Scanner;

public class DisplayArrayReverse {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        displayArrayReverse(arr, 0);

    }

    private static void displayArrayReverse(int[] arr,int index){
        if(arr.length == index){
            return;
        }

        displayArrayReverse(arr,index+1);
        System.out.println(arr[index]);
    }
}
