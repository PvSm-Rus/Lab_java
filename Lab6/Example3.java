public class Example3 {

    public static void main(String[] args) {
        min(1, 2, 3);
        max(1, 2, 3);
        average(1, 2, 3);
    }

    private static void min(int... nums) {
        int min = Integer.MAX_VALUE;
        for(int i : nums) {
            if(i < min) min = i;
        }
        System.out.println("min = " + min);
    }

    private static void max(int... nums) {
        int max = Integer.MIN_VALUE;
        for(int i : nums) {
            if(i > max) max = i;
        }
        System.out.println("max = " + max);
    }

    private static void average(int... nums) {
        int sum = 0;
        for(int i : nums) {
            sum += i;
        }
        int average = sum / nums.length;
        System.out.println("average = " + average);
    }
}
