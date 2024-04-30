package level1.Array;

import java.util.Scanner;

// input -- 634, 8
// ouput - 1172
public class DecimalToAnyBase {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int b = scn.nextInt();

        int pow = 1;
        int rv = 0;
        while (n>0)
        {
            int dig = n % b;
            n = n/ b;

            rv += dig*pow;
            pow = pow* 10;

        }

        System.out.println(rv);


    }
}
