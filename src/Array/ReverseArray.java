package Array;

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        // Array

        int a1[] = new int[n];

        for (int i = 0; i <a1.length ; i++) {

            a1[i] = scn.nextInt();
        }


        // Reverse A Array

        int i = 0;
        int j = a1.length -1;


        while (i <j)
        {
            int temp = a1[i];
            a1[i] = a1[j];
            a1[j] = temp;

            i++;
            j--;
        }


        display(a1);
    }

    public static void display(int a[])
    {
        for (int val:a)
        {
            System.out.println(val);
        }
    }
}
