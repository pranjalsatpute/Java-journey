//write a java program to calculate the factorial of a given no.
class Factorial {
    public static void main(String[] args) {
        int factorial = 1;
        for (int n = 2; n <= 5; n++) {
            factorial *= n;
        }
        System.out.println(factorial);
    }
}
