import java.util.Random;

public class Example8 {

    public static void main(String[] args) {

        int[] arr = generateArray(5);
        printArray(arr);

        int averageValue = calculateAverageValue(arr);
        System.out.println("Average value = " + averageValue);
    }

    private static int[] generateArray(int size) {

        Random rand = new Random();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) { arr[i] = rand.nextInt(10); }

        return arr;
    }

    private static int calculateAverageValue(int[] nums) {

        long total = 0;

        for(int i : nums) { total += i; }

        return (int) total / nums.length;
    }

    private static void printArray(int[] arr) {

        System.out.print("Array: ");

        for (int i : arr) { System.out.print(i + " "); }

        System.out.print("\n");
    }
}