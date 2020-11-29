package ex_3;

public class ex_1 {
    int num;

    ex_1 (int num) {
        this.num = num;
    }
    void setNum(int newNum) { num = newNum; }

    @Override
    public String toString() {
        return "One{" +
                "num=" + num +
                '}';
    }
}
