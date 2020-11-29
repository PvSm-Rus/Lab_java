import java.util.Random;

public class Example9 {

    public static void main(String[] args) {
        toRun(6);
        toRun(15);
    }

    private static void toRun(int arraySize) {
        char[] arr = generateArray(arraySize);
        printArray(arr);
        char[] newArr = swapElements(arr);
        printArray(newArr);
    }

    private static char[] generateArray(int size) {
        Random rand = new Random();
        char[] arr = new char[size];
        for (int i = 0; i < size; i++) { arr[i] = (char) ('a' + rand.nextInt(26)); }
        return arr;
    }

    private static char[] swapElements(char[] chars) {
        char[] newArr = new char[chars.length];
        int arrayHalfSize = chars.length / 2;
        for(int i = 0;  (chars.length % 2 == 0 && i < arrayHalfSize) || (chars.length % 2 != 0 && i <= arrayHalfSize); i++) {
            int rightIndex = chars.length - 1 - i;
            newArr[i] = chars[rightIndex];
            newArr[rightIndex] = chars[i];
        }
        return newArr;
    }

    private static void printArray(char[] arr) {
        for (char i : arr) { System.out.print(i + " "); }
        System.out.print("\n");
    }
}