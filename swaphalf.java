//write a java program to swap first half of the element with the second halfof the elements in a given array
//array must contain even no. of elements

import java.util.Arrays;

public class swaphalf {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int i = 0;
        int j = arr.length / 2;
        while (j <= arr.length - 1) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
