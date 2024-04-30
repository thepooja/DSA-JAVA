package level1.recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSubSequnece {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        ArrayList<String> gss = gss(s);
        System.out.println(gss);
    }

    private static ArrayList<String> gss(String s){

        if(s.length() == 0){
            ArrayList res = new ArrayList();
            res.add("");
            return res;
        }
        char ch = s.charAt(0);
        String rs = s.substring(1);

        ArrayList<String> mres = gss(rs);

        ArrayList<String> result = new ArrayList<>();
        for (String str:mres){
            result.add(""+str);
            result.add(ch + str);
        }

        return result;

    }
}
