public class Example10 {

    public static void main(String[] args) {
        findMinAndMax(1,2,7,3);
    }

    private static void findMinAndMax(int... nums) {
        printArray(nums);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i : nums) {

            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        System.out.println("min = " + min + ", max = " + max);
    }

    private static void printArray(int[] arr) {
        System.out.print("Array: ");
        for (int i : arr) { System.out.print(i + " "); }
        System.out.print("\n");
    }
}