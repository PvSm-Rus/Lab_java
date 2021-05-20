public class Example_14 {
    public static void m(int x) throws ArithmeticException {
        /* перехват исключения из-за расширения метода */
        int h = 10 / x;
    }

    public static void main(String[] args) {
        try {
            int l = args.length;
            System.out.println("Размер массива= " + l);
            m(l);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль");
            /* Размер массива= 0
               Ошибка: Деление на ноль */
        }
    }
}
