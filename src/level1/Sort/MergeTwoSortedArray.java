package level1.Sort;

import java.util.Arrays;

public class MergeTwoSortedArray {

    public static void main(String[] args) {

        int [] a1 = {2,5,12,18,20};
        int [] a2 = {7,9,11,15,25,28,30,35};

        int res[] = new int[a1.length + a2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while ( i < a1.length && j < a2.length){

            if(a1[i] < a2[j]){
                res[k] = a1[i];
                k++;
                i++;
            }
            else{
                res[k] = a2[j];
                k++;
                j++;
            }
        }


        while (i < a1.length){
            res[k] = a1[i];
            k++;
            i++;
        }


        while (j < a2.length){
            res[k] = a2[j];
            k++;
            j++;
        }

        System.out.println(Arrays.toString(res));

    }

    
}
