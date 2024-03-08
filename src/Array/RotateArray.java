package Array;

/**/
public class RotateArray {

    public static void main(String[] args) {

        int arr[] = new int[]{1,2,3,4,5};

        rotateArray(arr,2);
    }


    private static void reverseArray(int[] arr,int li, int ri)
    {

        while (li<ri)
        {
            int temp = arr[li];
            arr[li] = arr[ri];
            arr[ri] = temp;

            li++;
            ri--;
        }
    }

    private static void rotateArray(int[] a, int k)
    {
        //
        k = k % a.length;
        // if k is negative
        if (k <0)
        {
            k+= a.length;
        }

        // reverse part 1
        reverseArray(a,0, a.length-k-1);

        // reverse part 2
        reverseArray(a,a.length-k,a.length-1);

        // reverse all
        reverseArray(a,0, a.length-1);

        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }

    }


}
