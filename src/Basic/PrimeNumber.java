package Basic;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // Print prime numbers till N
        int n = scn.nextInt();


        optimizedSolution(n);

    }
    private static void simpleSolution(int n)
    {
        // Time Complexity - O(n2)
        for (int i = 2; i <n ; i++) {
            int count = 0;
            for (int j = 2; j <n ; j++) {

                if(i % j == 0)
                {
                    count++;
                }

            }
            if(count <2)
            {
                System.out.println(i+"is a prime Number");
            }
        }

    }

    private static void optimizedSolution(int n)
    {

         // Run a for loop till the sqaure div less than of N

        for (int i = 2; i <n ; i++) {
            int div = 2;
            while (div*div <= i)
            {
                if(i % div == 0)
                {
                    break;
                }
                div++;
            }

            if (div * div > i) {
                System.out.println(i);
            }
        }


    }
}
