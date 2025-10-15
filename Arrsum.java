//write a java program to calculate the sum and average of array elements
public class Arrsum {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            sum += arr[i];
        }
        int ave = sum / arr.length;
        System.out.println(sum);
        System.out.println(ave);// System.out.println(sum/arr.lenght) without using extra var
    }
}
