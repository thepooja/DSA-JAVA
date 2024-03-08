package Array;

import java.util.Scanner;

public class DigitsOfNumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int d = scn.nextInt();

        int f = getDigitFreq(n,d);
        System.out.println("Digits of Freq "+f);

    }

    private static int getDigitFreq(int n, int d) {
        int res = 0;
        while (n > 0){
            int rem = n % 10;
            n = n /10 ;

            if(rem == d)
            {
                res++;
            }
        }
        return res;
    }
}
