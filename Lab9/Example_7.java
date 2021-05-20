public class Example_7 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (NullPointerException e) {/* <- перехват исключения*/
            System.out.println("1");
            throw new ArithmeticException();
        } catch (ArithmeticException e) { /* Прерывание потока, исключение будет выброшено и не обработано*/
            System.out.println("2");
        }
        System.out.println("3");
    }
}
