package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetKeyPadCombination {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        ArrayList<String> result = gkc(str);

        System.out.println(result);

    }

    static String [] codes = {":,","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};

    private static ArrayList<String> gkc(String str){

        if(str.length() == 0){
            ArrayList<String> strings = new ArrayList<>();
            strings.add("");
            return strings;
        }

        char ch = str.charAt(0);
        String s = str.substring(1);
        ArrayList<String> mres = gkc(s);
        ArrayList<String> res = new ArrayList<>();

        String  code  = codes[ ch - '0'];

        for (int i = 0; i <code.length() ; i++) {
            char ch1 = code.charAt(i);
            for (String rs : mres){
                res.add( ch1+ rs);
            }

        }
        return res;
    }
}
