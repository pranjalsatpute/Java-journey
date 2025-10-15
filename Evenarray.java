//write a java program to print even numbers present inside the given array
public class Evenarray {
    public static void main(String[] args) {
        int[] arr = { 12, 23, 45, 66, 78, 98, 102, 105, 32, 49 };
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
//