public class Example4 {

    public static void main(String[] args) {
        doubleFactorial_without_recursion(6);
        doubleFactorial_with_recursion(5, 1);
    }

    private static void doubleFactorial_without_recursion(int num) {

        int result = 1;
        for(int i = num; i >= 1; i -= 2) {
            System.out.print(i);
            result *= i;

            if(i - 2 > 1) {
                System.out.print(" x ");
            }
        }
        System.out.println(" = " + result);
    }

    private static void doubleFactorial_with_recursion(int num, int total) {
        if(num < 1) {
            System.out.print(" = " + total);
            return;
        }
        System.out.print(num);
        total *= num;
        int nextNum = num - 2;
        if(nextNum >= 1) {
            System.out.print(" x ");
        }
        doubleFactorial_with_recursion(nextNum, total);
    }
}