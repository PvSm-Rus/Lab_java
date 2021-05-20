public class Example_9 {
    public static int m() {
        try {
            System.out.println("0");
            return 55; /* Выход из метода */
        } finally {
            System.out.println("1"); /* <- Будет вызван*/
        }
    }

    public static void main(String[] args) {
        System.out.println(m());
    }
}
