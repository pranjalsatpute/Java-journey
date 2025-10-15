//write a java program to calculate the sum and ave of odd numbers of array
public class Oddarrsum {
    public static void main(String[] args) {
        int[] arr = { 12, 23, 45, 66, 78, 98, 102, 105, 32, 49 };
        int sum = 0;
        int count = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] % 2 != 0) {
                sum += arr[i];
                count++;
            }
        }
        System.out.println(sum);
        System.out.println(sum / count);

    }
}
