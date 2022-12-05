package sorting.medium;

import java.util.Arrays;

/*
 * https://leetcode.com/problems/sort-colors/
 */
public class SortColors {
    // mine
    public void sortColorsSol1(int[] nums) {
        int[] arr = new int[3];
        for (int i : nums) {
            arr[i]++;
        }
        int idx = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < arr[i]; j++) {
                nums[idx++] = i;
            }
        }
        // 2 pase T.C = O(2n) = O(n), S.C = O(1)
    }

    // official / others
    public void sortColorsSol2(int[] nums) {
        int p0 = 0, curr = 0, p1 = nums.length - 1, tmp = 0;
        while (curr <= p1) {
            if (nums[curr] == 2) {
                tmp = nums[curr];
                nums[curr] = nums[p1];
                nums[p1--] = tmp;
            } else if (nums[curr] == 0) {
                tmp = nums[curr];
                nums[curr++] = nums[p0];
                nums[p0++] = tmp;
            } else {
                curr++;
            }
        }
        // T.C = O(n), S.C = O(1)
    }

    public static void main(String[] args) {
        int[] input = new int[] { 2, 0, 2, 1, 1, 0 };
        new SortColors().sortColorsSol2(input);
        System.out.println(Arrays.toString(input));
        input = new int[] { 2, 0, 2, 1, 1, 0 };
        new SortColors().sortColorsSol1(input);
        System.out.println(Arrays.toString(input));
    }
}
