package Array;

import java.util.Arrays;

public class FindFirstLastPositionOfSortedArray {
    public static void main(String[] args) {

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] in = searchRange(nums,target);
        System.out.println(Arrays.toString(in));
    }

    public static int[] searchRange(int[] nums, int target) {

        int start = 0;
        int last = nums.length - 1;
        int[] searchIndex = { -1, -1 };

        // firstIndex
        while (start <= last) {
            int mid = (start + last) / 2;

            if (nums[mid] == target) {
                searchIndex[0] = mid;
                last = mid - 1;

            } else if (nums[mid] > target) {
                last = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        // lastIndex
        start = 0;
        last = nums.length - 1;
        while (start <= last) {
            int mid = (start + last) / 2;
            if (nums[mid] == target) {
                searchIndex[1] = mid;
                start = mid + 1;

            } else if (nums[mid] > target) {
                last = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return searchIndex;
    }

}
