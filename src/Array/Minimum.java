package Array;

import java.util.ArrayList;

public class Minimum {

    public static void main(String[] args) {

        ArrayList<Integer> sample = new ArrayList<>();

        sample.add(10);
        sample.add(5);
        sample.add(8);
        sample.add(17);

        Minimum.findMinimum(sample);


    }

    static void findMinimum(ArrayList<Integer> sample)
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int temp = 0 ;
        for (int i = 0; i <sample.size() ; i++) {
            temp = sample.get(i);

            if (min >= temp)
            {
                min = temp;
            }

            if (max <= temp)
            {
                max = temp;
            }




        }

        System.out.println("Minimum Value is --"+min);

        System.out.println("Maximum Value is ---"+max);
    }
}
