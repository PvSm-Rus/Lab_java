import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_3 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите элементы массива: ");
        byte[] arr = arr();
        method(arr);

    }

    public static void method(byte[] arr) {
        byte result = 0;
        for (byte b : arr) {
            result += b;
        }
        System.out.println(result);
    }

    public static byte[] arr() {
        byte[] arr = new byte[6];
        try {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextByte();
            }
        } catch (InputMismatchException e) {
            System.out.println("Введено некорректное значение -> " + e);
        }

        return arr;
    }
}
