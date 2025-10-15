// write a java program to solve the given array in ascending order without
// making use of arrays.sort

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 5, 4, 7, 6, 8, 9 };
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
