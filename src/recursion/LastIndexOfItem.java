package recursion;

import java.util.Scanner;

public class LastIndexOfItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int d = scanner.nextInt();
        int li = lastIndex(arr,0,3);
        System.out.println(li);

    }

    private static int lastIndex(int[]arr,int index,int data){
        if(index == arr.length){
            return -1;
        }

        int liisa = lastIndex(arr, index+1, data);

        if(liisa == -1){
            if(arr[index] == data){
                return index;
            }
            else {
                return  -1;
            }
        }
        else {
            return liisa;
        }
    }
}
