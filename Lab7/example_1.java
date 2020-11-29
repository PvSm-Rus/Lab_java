public class example_1 {

    public static void main(String[] args) {

        Sub_1 subCls = new Sub_1("subclass text");

        System.out.println(subCls.toString());

        System.out.println();

        Sub_1 subCls_2 = new Sub_1("super text 1", "subclass text");

        System.out.println(subCls_2.toString());
    }
}

class Super_1 {
    private String superText;
    Super_1() {
    }
    Super_1(String superText) {
        this.superText = superText;
    }
    @Override
    public String toString() {
        return "Class: Super_1, superText: " + superText;
    }
}

class Sub_1 extends Super_1 {
    private final String subText;
    Sub_1(String subText) {
        super();
        this.subText = subText;
    }
    Sub_1(String superText, String subText) {
        super(superText);
        this.subText = subText;
    }
    @Override
    public String toString() {
        return super.toString() + "\nClass: " + this.getClass().getName() + ", subText: " + subText;
    }
}
