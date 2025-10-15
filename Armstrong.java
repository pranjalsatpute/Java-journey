//armstrong no.
//153 has 3 digits in it
//so we multiply each digit in the number count times that is 3 times
// 1^3 + 5^3 + 3^3 which will be equal to 153 itself 
//the summation is equal to the number hence it is a armstrong digit 
//write a java program to check wthere the given no is armstrong no. if given no is armstrong no then print true otherwise print false
public class Armstrong {
    public static void main(String[] args) {
        int num = 153;
        int copy1 = num;
        int count = 0;
        int copy2 = num;
        int sum = 0;
        while (num > 0) {
            count++;
            num /= 10;
            // above two line will give the count
        }
        while (copy1 > 0) {
            int d = copy1 % 10;
            int res = 1;
            for (int i = 1; i <= count; i++) {
                res *= d;
            }
            sum += res;
            copy1 /= 10;
        }
        System.out.println(sum == copy2);
    }
}
