import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Task_2 {
    static Scanner in = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        int[][] arr = randArr();
        print(arr);
        method(arr);

    }

    public static void method(int[][] arr) {
        System.out.println("Введите номер столбца: ");
        int colIndex = 0;
        try {
            colIndex = in.nextInt();
        } catch (InputMismatchException e) { /* вызывается при несоответсвтии шаблона ожидаемого типа */
            System.out.println("Столбец - это целое число -> " + e);
            return;
        }
        try {
            for (int[] ints : arr) {
                System.out.println(ints[colIndex]);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Такого столбца не существует -> " + e);
        }
    }

    public static void print(int[][] arr) {
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public static int[][] randArr() {
        int[][] arr = new int[4][6];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(10);
            }
        }
        return arr;
    }
}
