package ex_3;

public class ex_3 extends ex_2 {
    String text;
    ex_3(int num, char ch, String text) {
        super(num, ch);
        this.text = text;
    }
    void setFields(int num, char ch, String text) {
        super.setFields(num, ch);
        this.text = text;
    }
    @Override
    public String toString() {
        return "Three{" +
                "num=" + num +
                ", ch=" + ch +
                ", text='" + text + '\'' +
                '}';
    }
}
