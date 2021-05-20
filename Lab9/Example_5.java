public class Example_5 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка"); /* Прервывание потока, исключение не будет перехвачено*/
        } catch (NullPointerException e) {
            System.out.println("1");
        }
        System.out.println("2");
    }
}
