package recursion;

import java.util.Scanner;

public class TargetSumSubsets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr [] = new int[n];

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = scanner.nextInt();
        }

        // target
        int tar = scanner.nextInt();

        printSumSubSets(arr,0,"",0,tar);
    }

    private static void printSumSubSets(int arr[],int index,String set, int sos, int tar){
        if(index == arr.length){
            if (sos == tar){
                System.out.println(set + " .");
            }
            return;
        }
        printSumSubSets(arr, index+1,set+arr[index]+" , ",sos+arr[index],tar);
        printSumSubSets(arr, index+1,set,sos,tar);

    }
}
