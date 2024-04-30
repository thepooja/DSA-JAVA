package level1.Sort;

public class QuickSelect {

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 9, 7, 4, 6};
        int k = 2;
        int sol = quickSelectFun(arr, 0, arr.length - 1, k - 1);
        System.out.println("Kth Element --> " + sol);
    }

    private static int quickSelectFun(int[] arr, int low, int hi, int k) {
        int pivot = arr[hi];

        int pi = partition(arr, pivot, low, hi);

        if (k > pi) {
            return quickSelectFun(arr, pi + 1, hi, k);
        } else if (k < pi) {
            return quickSelectFun(arr, low, pi - 1, k);
        } else {
            return arr[pi];
        }

    }

    private static int partition(int[] arr, int pivot, int low, int hi) {

        int i = low, j = low;

        while (i <= hi) {
            if (arr[i] <= pivot) {
                swap(arr, i, j);
                i++;
                j++;
            } else {
                i++;
            }
        }

        return (j - 1);
    }


    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
