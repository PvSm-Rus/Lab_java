import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        depclass s = new depclass();
        s.print();
        s.set('F');
        s.set("new string value");
        s.print();
        char[] chars = {'N'};
        s.set(chars);
        s.print();
        chars = new char[]{'H', 'e', 'l', 'l', '0'};
        s.set(chars);
        s.print();
    }
}
class depclass {

    private char ch;
    private String str;
    void set(char ch) {
        this.ch = ch;
    }
    void set(char[] chars) {
        if(chars.length == 1) {
            ch = chars[0]; }
        else {
            str = Arrays.toString(chars);
        }
    }
    void set(String str) {
        this.str = str;
    }
    void print() {
        System.out.println("ch = " + ch + ", str = " + str);
    }
}
