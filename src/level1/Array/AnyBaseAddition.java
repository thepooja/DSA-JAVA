package level1.Array;

import java.util.Scanner;

public class AnyBaseAddition {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int b = scn.nextInt();

        int val = getAnyBaseAddition(num1,num2,b);

        System.out.println(val);
    }
    static int getAnyBaseAddition(int n, int n2, int b)
    {
        int rv = 0;
        int c =0;
        int pow = 1;
        while ( n> 0 || n2 >0 || c >0) {
            int d1 = n % 10;
            int d2 = n2 % 10;

            n = n / 10;
            n2 = n2 / 10;

            int dig = d1+d2+c;

            c= dig/b;

            dig = dig % b;

            rv+= dig *pow;

            pow = pow*10;

        }

        return  rv;
    }
}
