package StringsPrograms;

import java.util.Scanner;

// Input -->
// Output -->
public class ToggleString {

    public static String toggleString(String str){
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i <sb.length() ; i++) {
            char ch = sb.charAt(i);
            if(ch >='a' && ch<= 'z' ){
                char upc = (char) (ch - 'a' + 'A');
                sb.setCharAt(i,upc);
            }
            else if(ch >= 'A' && ch<= 'Z'){
                char lwc = (char) (ch - 'A' + 'a');
                sb.setCharAt(i,lwc);
            }
        }

return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(toggleString(str));
    }
}
