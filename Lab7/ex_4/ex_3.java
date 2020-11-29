package ex_4;

public class ex_3 extends ex_2  {
    int num;
    ex_3(char ch, String text, int num) {
        super(ch, text);
        this.num = num;
    }
    ex_3(ex_3 obj) {
        this(obj.ch, obj.text, obj.num);
    }
    @Override
    public String toString() {
        return "Three{" +
                "num=" + num +
                ", text='" + text + '\'' +
                ", ch=" + ch +
                '}';
    }
}
