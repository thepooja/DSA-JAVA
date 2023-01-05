package Interview;

import java.util.Arrays;
import java.util.Scanner;
/*Question link --
* https://www.geeksforgeeks.org/minimum-number-platforms-required-railwaybus-station/
* */
public class DifferenceBetweenTwoTrain {
    // Input: n = 6
    /*
    arr[] = {0900, 0940, 0950, 1100, 1500, 1800}

dep[] = {0910, 1200, 1120, 1130, 1900, 2000}

 Output = 3
    * */
    public static void main(String[] args) {

        int arr[] = new int[]{900, 940, 950, 1100, 1500, 1800};

        int dep[] = new int []{910, 1200, 1120, 1130, 1900, 2000};

        //

        int platforms = findPlatform(arr,dep);
        System.out.println(platforms);


    }


    private  static int findPlatform(int[] arr, int[] dep)
    {
        //Sort Arrival & Departure Train
        Arrays.sort(arr);
        Arrays.sort(dep);

        // Maintain max train a particular time

        int n = arr.length;
        int i =0; // Pointing Arrival Time
        int j =0; // Poining Departure Time
        int maxTrain = 0;
        int platform = 0;

        while (i<n && j<n)
        {

            if(arr[i] <= dep[j]){
                maxTrain++;
                i++;
            }
            else {
                maxTrain--;
                j++;
            }

            platform = Math.max(platform,maxTrain);
        }

        return platform;
    }
}
