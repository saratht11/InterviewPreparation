package sorting;

import java.util.Arrays;

public class BubbleSort {
    public void bubbleSortDesc(int[] nums) {
        boolean changed = false;
        for (int i = 0; i < nums.length - 1; i++) {
            changed = false;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                    changed = true;
                }
            }
            if (!changed) {
                break;
            }
        }

    }

    public void bubbleSortAsc(int[] nums) {
        boolean changed = false;
        for (int i = 0; i < nums.length - 1; i++) {
            changed = false;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                    changed = true;
                }
            }
            if (!changed) {
                break;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = new int[] { 9, 9, 6, 2, 3, 3, 7, 6, 8, 1 };
        System.out.println(Arrays.toString(arr));
        new BubbleSort().bubbleSortAsc(arr);
        System.out.println(Arrays.toString(arr));
        new BubbleSort().bubbleSortDesc(arr);
        System.out.println(Arrays.toString(arr));

    }

}
