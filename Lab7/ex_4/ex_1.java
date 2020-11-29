package ex_4;

public class ex_1 {
    char ch;
    ex_1(char ch) {
        this.ch = ch;
    }
    ex_1(ex_1 obj) {
        this(obj.ch);
    }
    @Override
    public String toString() {
        return "One{" +
                "ch=" + ch +
                '}';
    }
}
