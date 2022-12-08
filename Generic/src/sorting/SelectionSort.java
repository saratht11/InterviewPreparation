package sorting;

import java.util.Arrays;

public class SelectionSort {
    public void selectionSortAsc(int[] nums) {
        int min;
        for (int i = 0; i < nums.length; i++) {
            min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[min] > nums[j]) {
                    min = j;
                }
            }
            int tmp = nums[min];
            nums[min] = nums[i];
            nums[i] = tmp;
        }
    }

    public void selectionSortDesc(int[] nums) {
        int max;
        for (int i = 0; i < nums.length; i++) {
            max = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[max] < nums[j]) {
                    max = j;
                }
            }
            int tmp = nums[max];
            nums[max] = nums[i];
            nums[i] = tmp;
            System.out.println(Arrays.toString(nums));
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1,2,3,4,5,6,7 };
        System.out.println(Arrays.toString(arr));
        new SelectionSort().selectionSortDesc(arr);
        System.out.println(Arrays.toString(arr));
        // new SelectionSort().selectionSortAsc(arr);
        // System.out.println(Arrays.toString(arr));
    }
}
