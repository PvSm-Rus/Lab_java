package ex_3;

public class ex_2 extends ex_1 {
    char ch;
    ex_2(int num, char ch) {
        super(num);
        this.ch = ch;
    }
    void setFields(int num, char ch) {
        super.setNum(num);
        this.ch = ch;
    }
    @Override
    public String toString() {
        return "Two{" +
                "num=" + num +
                ", ch=" + ch +
                '}';
    }
}
