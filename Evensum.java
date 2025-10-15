//write a java program to calculate the sum of even digits from a given number
//get the digit
//after extraction of digit check if the digit is even
//if even add
//print sum
public class Evensum {
    public static void main(String[] args) {
        int num = 1234;
        int sum = 0;
        while (num > 0) {
            int d = num % 10;// extracts digit
            if (d % 2 == 0) {// we check if the number is even or odd if its even we add
                sum += d;
            }
            num /= 10;// remove last digit
        }
        System.out.println(sum);
    }
}
