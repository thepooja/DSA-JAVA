package StringsPrograms;

import java.util.Scanner;

// Input --> wwwwaaadexxxxxx
/*
Output
wadex
w4a3dex6
*/
public class StringCompression {

    public static String compression1(String str){
        String cmp = str.charAt(0)+"";
        for (int i = 1; i <str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr != prev)
            {
                cmp+=curr;
            }
        }

        return cmp;
    }

    public static String compression2(String str) {
        String cmp2 = str.charAt(0)+"";
        int cnt = 1;
        for (int i = 1; i <str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr == prev){
                cnt++;
            }
            else {
                if(cnt>1)
                {
                    cmp2+=cnt;
                    cnt = 1;
                }
                cmp2+=curr;
            }
        }
        if(cnt>1)
        {
            cmp2+=cnt;
            cnt = 1;
        }

        return cmp2;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(compression1(str));
        System.out.println(compression2(str));
    }
}
