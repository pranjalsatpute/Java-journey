//write a java program to print uppercase as well as lower case alphabets
//ASCII values of '0' is 48, 'A' is 65, 'a' is 97
class Upperlower {
    public static void main(String[] args) {
        char lower = 'a';
        char upper = 'A';
        for (lower = 'a'; lower <= 'z'; lower++) {
            System.out.print(lower + " ");
        }
        for (upper = 'A'; upper <= 'Z'; upper++) {
            System.out.print(upper + " ");
        }
    }

}
