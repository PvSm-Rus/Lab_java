public class Example_4 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
        } catch (Exception e) {
            System.out.println("2");/* <- будет вызван обработчик событий*/
        } catch (Error e) {
            System.out.println("3");
        }
        System.out.println("4");
    }
}
