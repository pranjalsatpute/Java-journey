public class Array {
    public static void main(String[] args) {
        // int[] arr={1,2,3,4,5,6};
        // System.out.println(arr[2]);
        // arr[2]=4;
        // System.out.println(arr[2]);
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);
        }
    }
}
