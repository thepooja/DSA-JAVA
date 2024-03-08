package recursion;

import java.util.Scanner;

public class PrintSubsequences {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        pss(str,"");

    }

    private static void pss(String ques,String ans){
        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        String roq = ques.substring(1);

        pss(roq,ans+"");
        pss(roq,ans+ch);
    }
}
