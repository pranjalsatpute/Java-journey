// write a java program to merge two sorted arrays in sorted manner

import java.util.Arrays;

public class mergesorted {
    public static void main(String[] args) {
        int[] arr1 = { 1, 4, 5, 7, 9 };
        int[] arr2 = { 2, 3, 6, 8 };
        int[] res = new int[arr1.length + arr2.length];
        int j = 0;
        int i = 0;
        int k = 0;
        while (i <= arr1.length - 1 && j <= arr2.length - 1) {
            if (arr1[i] < arr2[j]) {
                res[k++] = arr1[i++];
            } else {
                res[k++] = arr2[j++];
            }
        }
        while (i <= arr1.length - 1) {
            res[k++] = arr1[i++];
        }
        while (j <= arr2.length - 1) {
            res[k++] = arr2[j++];
        }
        System.out.println(Arrays.toString(res));
    }
}
