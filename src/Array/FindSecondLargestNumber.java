package Array;

public class FindSecondLargestNumber {

    public static void main(String[] args) {

        int arr[] = {12, 35, 1, 10, 34, 1};

        findSecondLargestNumber(arr);

    }

    private static void findSecondLargestNumber(int[] arr) {

        int second, first;
        first = second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > first) {

                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first)
                second = arr[i];

        }


        System.out.println("Second Largest Number is " + second);
    }
}
