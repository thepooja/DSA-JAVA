package Interview;

import java.util.Scanner;

// Simplilearn --> 21/04/2022
public class PalindromeString {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        int i = 0;
        int j = s.length()-1;
        char [] c = s.toCharArray();
        boolean flag = false;

        while(i<=j)
        {
            if(c[i] == c[j])
            {
                i++;
                j--;
                flag = true;
            }

            else {
            flag = false;
            break;

        }
        }


        if(flag)
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
        }
    }


}
