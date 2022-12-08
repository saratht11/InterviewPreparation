package sorting;

import java.util.Arrays;

public class InsertionSort {
    public void insertionSortAsc(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (nums[j] > temp) {
                    nums[j + 1] = nums[j];
                } else {
                    break;
                }
            }
            j++;
            nums[j] = temp;
        }
    }

    public void insertionSortDesc(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (nums[j] < temp) {
                    nums[j + 1] = nums[j];
                } else {
                    break;
                }
            }
            j++;
            nums[j] = temp;
        }

    }

    public static void main(String[] args) {

        int[] arr = new int[] { 9, 9, 6, 2, 3, 3, 7, 6, 8, 1 };
        System.out.println(Arrays.toString(arr));
        new InsertionSort().insertionSortAsc(arr);
        System.out.println(Arrays.toString(arr));
        new InsertionSort().insertionSortDesc(arr);
        System.out.println(Arrays.toString(arr));
    }

}
