import java.util.Random;

public class Example6 {

    public static void main(String[] args) {
        int[] arr = generateArray();
        printArray(arr);
        int[] newArr = copyElements(arr, 3);
        printArray(newArr);
        int[] newArr_2 = copyElements(arr, 30);
        printArray(newArr_2);
    }

    private static int[] generateArray() {
        Random rand = new Random();
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) { arr[i] = rand.nextInt(10); }
        return arr;
    }

    private static int[] copyElements(int[] nums, int num) {
        int newArrLength = Math.min(num, nums.length);
        int[] newArr = new int[newArrLength];
        System.arraycopy(nums, 0, newArr, 0, newArrLength);
        return newArr;
    }

    private static void printArray(int[] arr) {
        for (int i : arr) { System.out.print(i + " "); }
        System.out.print("\n");
    }
}