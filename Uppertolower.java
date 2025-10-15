//write a java program to convert a given uppercase alphabet to lower case or vice versa
class Uppertolower {
    public static void main(String[] args) {

        char ch = 'A';
        if (ch >= 'A' && ch <= 'Z') {
            // typecasting :in typecasting we can forcefully change the datatype usig syntax
            // datatype varname=(datatype)(value)
            char res = (char) (ch + 32);// (ch +32) has a int datatype which will be converted into chara
            System.out.println(res);
        } else {
            char res = (char) (ch + 32);
            System.out.println(res);
        }

    }
}
