package Array;

import java.util.Scanner;

public class PrimeNotPrime {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // Get
        int t = scn.nextInt();

        // Input -- 5 --> (number of inputs)
        // Input -- Inputs --. (3,7, 11, 12, 15)
        // We have to print number is prime or Notprime


        // we will check by number's square root is not greater than number --
        // p & q is not greater than square root of number
        for (int i = 0; i <t ; i++) {

            // Get inputs
            int n = scn.nextInt();

            int count = 0;

            // check div*div is less than n
            for (int div = 2;div*div <= n;div++)
            {
                if (n%div == 0)
                {
                    count++;
                    break;
                }
            }

            if (count == 0)
            {
                System.out.println("prime");
            }
            else {
                System.out.println("not prime");
            }
        }



    }
}
