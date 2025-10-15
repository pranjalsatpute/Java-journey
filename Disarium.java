//write a java program to check if the given no. is disarium number
//disarium no.
//89 has 2 digit here 9 is in second no. so we multiply 9 times its position
// 8^1 + 9^2 = 89 same as the original number so its a disarium no
//get the count of digits
//extract digits from num
//multiply the digit according to their position
public class Disarium {
    public static void main(String[] args) {
        int num = 89;
        int count = 0;
        int copy1 = num;
        int copy2 = num;
        while (num > 0) {
            count++;
            num /= 10;// removes the last digit
        }
        int sum = 0;
        while (copy1 > 0) {
            int d = copy1 % 10;// extracts the last digit
            int res = 1;
            for (int i = 1; i <= count; i++) {
                res *= d;
            }
            sum += res;
            copy1 /= 10;
            count--;
        }
        System.out.println(sum == copy2);
    }
}
