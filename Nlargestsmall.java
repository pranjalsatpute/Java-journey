import java.util.Arrays;

public class Nlargestsmall {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9, 1 };
        int n = 3;
        Arrays.sort(arr);
        System.out.println("nth smallest" + arr[n - 1]);
        System.out.println("nth largest" + arr[arr.length - n]);
    }

}
