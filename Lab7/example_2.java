public class example_2 {

    public static void main(String[] args) {

        Sub_2 subCls = new Sub_2(3, "superClass text");
        System.out.println(subCls.toString());

        subCls.initFields("two");
        System.out.println(subCls.toString());

        subCls.initFields(1, "one");
        System.out.println(subCls.toString());
    }
}

class Super_2 {

    private String superText;

    Super_2() { initText(); }

    void initText() { superText = "default"; }
    void initText(String text) { superText = text; }
    @Override
    public String toString() {
        return "Class: Super_2, superText: " + superText;
    }
}

class Sub_2 extends Super_2 {
    int num;
    Sub_2(int num, String text) {
        this.num = num;
        super.initText(text);
    }
    private void initNumDefault() { num = -1; }
    void initFields() {
        initNumDefault();
        super.initText();
    }
    void initFields(int num) {
        this.num = num;
        super.initText();
    }
    void initFields(String text) {
        initNumDefault();
        super.initText(text);
    }
    void initFields(int num, String text) {
        this.num = num;
        super.initText(text);
    }
    @Override
    public String toString() {
        return super.toString() + "\nClass: " + this.getClass().getName() + ", num: " + num;
    }
}