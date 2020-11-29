package ex_4;

public class ex_2 extends ex_1 {
    String text;
    ex_2(char ch, String text) {
        super(ch);
        this.text = text;
    }
    ex_2(ex_2 obj) {
        this(obj.ch, obj.text);
    }
    @Override
    public String toString() {
        return "Two{" +
                "text='" + text + '\'' +
                ", ch=" + ch +
                '}';
    }
}
