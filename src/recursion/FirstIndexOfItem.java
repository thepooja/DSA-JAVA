package recursion;

import java.util.Scanner;

public class FirstIndexOfItem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int d = scanner.nextInt();
        int fi = firstIndex(arr,0,d);
        System.out.println(fi);
    }
    private static int firstIndex(int arr[],int index,int data){
        if (index == arr.length){
            return -1;
        }
        int fisa = firstIndex(arr, index+1, data);

        if(arr[index] == data){
            return arr[index];
        }
        else {
            return fisa;
        }
    }
}
