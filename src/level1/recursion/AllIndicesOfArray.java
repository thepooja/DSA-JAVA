package level1.recursion;

import java.util.Scanner;

public class AllIndicesOfArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int d = scanner.nextInt();
        int[] li = allIndicesOfArray(arr, 0, d, 0);

        for (int i = 0; i < li.length; i++) {
            System.out.print(li[i]);
        }

    }

    private static int[] allIndicesOfArray(int[] arr, int index, int data, int fsf) {
        if (index == arr.length) {
            return new int[fsf];
        }
        int[] arr1;

        if (arr[index] == data) {
            arr1 = allIndicesOfArray(arr, index + 1, data, fsf + 1);
            arr1[fsf] = index;
        } else {
            arr1 = allIndicesOfArray(arr, index + 1, data, fsf);
        }
        return arr1;
    }
}
