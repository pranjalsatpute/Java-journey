//write a java program to calculate the sum of first n natural numbers
class Sumnatural {
    public static void main(String[] args) {
        int sum = 0;
        for (int n = 1; n <= 30; n++) {
            sum += n;
        }
        System.out.println(sum);
    }

}
