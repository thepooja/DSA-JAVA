package Array;

import java.util.Scanner;

public class AnyBaseSubtraction {


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int base = scn.nextInt();
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        int val = getDifference(num1,num2,base);

        System.out.println(val);
    }

    static int getDifference(int n1, int n2, int b )
    {
        int rv = 0;
        int pow = 1;
        int c =0;

        while (n2 >0) {
            int d1 = n1 % 10;
            n1 = n1 / 10;
            int d2 = n2 % 10;
            n2 = n2 / 10;

            int d = 0;

            d2 = d2+c;

            if(d2 >d1)
            {
                c = 0;
                d = d2-d1;
            }
            else {
                c = -1;
                d = d2+b-d1;
            }


            rv += d *pow;

            pow = pow *10;

        }


        return rv;
    }
}
