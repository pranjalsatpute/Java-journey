// write a java program to replace all the array elements by their squares
public class Squareofarr {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] *= arr[i];// int square= arr[i]*arr[i];
            System.out.println(arr[i]);
        }
    }
}
