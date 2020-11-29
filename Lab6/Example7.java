import java.util.Random;

public class Example7 {

    public static void main(String[] args) {
        char[] arr = generateArray();
        printArray(arr);
        int[] newArr = getCharsCodes(arr);
        printCharsCodes(newArr);
    }

    private static char[] generateArray() {
        Random rand = new Random();
        char[] arr = new char[5];
        for (int i = 0; i < 5; i++) { arr[i] = (char) ('a' + rand.nextInt(26)); }
        return arr;
    }

    private static int[] getCharsCodes(char[] chars) {
        int[] newArr = new int[chars.length];
        for(int i = 0; i < chars.length; i++) { newArr[i] = chars[i]; }
        return newArr;
    }

    private static void printArray(char[] arr) {
        for (char i : arr) { System.out.print(i + " "); }
        System.out.print("\n");
    }

    private static void printCharsCodes(int[] arr) {
        System.out.println("Chars codes: ");
        for (int i : arr) { System.out.print(i + " "); }
        System.out.print("\n");
    }
}