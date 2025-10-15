//write a java program to calculate the product of odd digits in a given number
public class Oddproduct {
    public static void main(String[] args) {
        int num = 1234;
        int product = 1;
        while (num > 0) {
            int d = num % 10;
            if (d % 2 == 1) {
                product *= d;
            }
            num /= 10;
        }
        System.out.println(product);
    }
}
