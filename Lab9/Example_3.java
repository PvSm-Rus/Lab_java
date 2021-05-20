public class Example_3 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) { /*в этом блоке исключение не перехватиться*/
            System.out.println("1");
        } catch (RuntimeException e) {
            System.out.println("2");
        } catch (Exception e) { /*этот блок не выполниться*/
            System.out.println("3");
        }
        System.out.println("4");
    }
}
