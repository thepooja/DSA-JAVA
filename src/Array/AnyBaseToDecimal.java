package Array;

import java.util.Scanner;


// INPUT -- 1172, 8
// output -- 634
public class AnyBaseToDecimal {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();

        int b = scn.nextInt();

        int rv =0;
        int pow = 1;

        while(num >0)
        {
            int dig = num % 10;

            num = num / 10;

            rv+= dig* pow;

            pow = pow* b;
        }

        System.out.println(rv);
    }
}
