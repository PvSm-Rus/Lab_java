import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_1 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = inputArr();
        method(arr);
    }
    public static int[] inputArr() {
        int[] arr = new int[5];
        System.out.println("Введите числа");

        try {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
        } catch (InputMismatchException e) { /* вызывается при несоответсвтии шаблона ожидаемого типа */
            System.out.println("Ошибка ввода данных");
        }
        return arr;
    }
    public static void method(int[] arr) {
        int result = 0;
        for (int j : arr) {
            if (j > 0) {
                result += j;
            }
        }
        if (result <= 0) {
            throw new NullPointerException("Положительные элементы отсутствуют");
        } else {
            System.out.println(result / arr.length);
        }
    }


}
