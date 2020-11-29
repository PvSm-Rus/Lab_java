public class Example2 {
    private static int num = 0;

    public static void main(String[] args) {
        outInkremNum();
        outInkremNum();
        outInkremNum();
    }

    private static void outInkremNum() {
        System.out.println("Current num value = " + num++);
    }
}
