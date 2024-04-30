package level1.StringsPrograms;

import java.util.Scanner;

// input -> abc
/*Output
abc
bac
cab
acb
bca
cba
* */
public class PermutationsString {

    public static void solution(String str){

        int length = str.length();
        int fact = factorial(length);

        for (int number = 0; number <fact ; number++) {
            StringBuilder sb= new StringBuilder(str);
            int temp = number;
            for (int div = length; div >=1 ; div--) {

                int quo = temp/div;
                int rem = temp%div;
                System.out.print(sb.charAt(rem));

                sb.deleteCharAt(rem);

            }

            System.out.println();
        }
    }

    public static int factorial(int n){
        int val = 1;

        for (int i = 1; i <=n ; i++) {
            val*=i;
        }
        return val;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }
}
