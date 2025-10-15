//write a java program to swap adjecent elements in a given array

import java.util.Arrays;

public class swapadjarra {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int i = 0;
        int j = 1;
        while (j <= arr.length - 1) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i += 2;
            j += 2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
