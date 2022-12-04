package bitManipulation.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/counting-bits/
 */
public class CountingBits {
    // Mine
    public int[] countBitsSol1(int n) {
        int[] result = new int[n + 1];

        for (int i = 0; i < 32; i++) {
            int m = 1 << i;
            for (int j = 0; j <= n; j++) {
                if ((j & m) != 0) {
                    result[j]++;
                }
            }
        }
        return result;
        // T.C = O(32 * n) = O(nlogn), S.C =O(1)
    }

    // Official / Others
    public int[] countBitsSol2(int n) {
        int[] result = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            result[i] = result[(i & (i - 1))] + 1;
        }
        return result;
        // T.C = O (n) , S.C = O(1)
    }

    public static void main(String[] args) {
        int[] result = new CountingBits().countBitsSol1(5);
        System.out.println(Arrays.toString(result));

        result = new CountingBits().countBitsSol2(5);
        System.out.println(Arrays.toString(result));
    }

}
