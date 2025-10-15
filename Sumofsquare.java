public class Sumofsquare {
    public static void main(String[] args) {
        int num = 1234;
        int sum = 0;

        while (num > 0) {
            int d = num % 10;
            int sq = d * d;// sum+=(d*d);
            sum += sq;
            num /= 10;
        }
        System.err.println(sum);
    }
}
