package Interview;

import java.util.Scanner;
/*
* Write a program which takes two strings as input from the user (str1 and str2). This program should print two strings as output (op1 and op2).

op1 should contain all the characters which are present in str1 but NOT present in str2.

op2 should contain all the characters which are present in str2 but NOT present in str1.

 For example:
Example 1
str1  == ABC
str2 = BC
op1 = A
op2 = null
Example 2
str1 = BC
str2 =BANGALORE
op1 =C
op2 = ANGLORE
* */
public class StringCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String opt1= "";
        String opt2 = "";
        int i =0;

        // OPT1
        while(i < str1.length()){

            if(str2.indexOf(str1.charAt(i)) ==-1){
                opt1 = opt1+str1.charAt(i);
                i++ ;
            }
            else{
               i++;
            }
        }
        // OPT2
        i=0;
        while(i < str2.length()){

            if(str1.indexOf(str2.charAt(i)) ==-1){
                opt2 = opt2+str2.charAt(i);
                i++ ;
            }
            else{
                i++;
            }
        }

        if (opt2 == ""){
            opt2=null;
        }
        if(opt1==""){
            opt1=null;
        }

        System.out.println( "OPT1 -- "+opt1);
        System.out.println( "OPT2 -- "+opt2);


    }
}
