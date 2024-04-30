package level1.Interview;


import java.util.HashMap;
import java.util.Map;

/*quesion -
*
* Given a string, write a program to find the character which is repeated the
maximum number of times and the number of maximum occurrences.

E.g.:
1. Input: acbcack
1. Output: c 3

2. Input: rajasoftwarelabs
2. Output: a 4

* */
public class MaximumOccurrenceChar {

    public static void main(String[] args) {

        String str = "acbcack";

        MaximumOccurrenceChar c = new MaximumOccurrenceChar();
        String results1 = c.optimisedCode(str);
        String results2 = c.simpleCode(str);


    }


    private String optimisedCode(String str)
    {
        String result = null;

        HashMap<Character,Integer> cnt = new HashMap<>();

        for (int i = 0; i <str.length() ; i++) {

            if (cnt.get(str.charAt(i)) == null)
            {
                cnt.put(str.charAt(i),1);
            }
            else {
                cnt.put(str.charAt(i),(cnt.get(str.charAt(i))+1));
            }

        }


        int temp =0;
        char ch1 = ' ';
        for (Character c:cnt.keySet())
        {
            int val = cnt.get(c);
            if (val >temp)
            {
                ch1 = c;
                temp = val;
            }
        }

        result =   ch1 +" "+temp;

        return result;
    }

    private String simpleCode(String str)
    {
        String result = null;

        HashMap<Character,Integer> cnt = new HashMap<>();
        int count =0;
        int i =0;
        while (str.length() >i)
        {
            for (int j = 0; j <str.length() ; j++) {

                if (str.charAt(i) == str.charAt(j))
                {
                    count++;
                    cnt.put(str.charAt(i),count);
                }
            }

            count = 0;
            i++;

        }


        int temp = 0;
        char c = ' ';
        for(char ch:cnt.keySet())
        {

            int val1 = cnt.get(ch);
            if( val1 > temp )
            {
                c = ch;
                temp = val1;
            }

        }

       result =  c +" "+temp;
        return result;

    }

}



