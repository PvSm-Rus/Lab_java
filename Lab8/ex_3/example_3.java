package ex_3;

import java.util.Scanner;

public class example_3 {
    private static final Scanner in = new Scanner(System.in);
    private static int index = 0;
    private static final int[] arr = new int[0];

    public static void main(String[] args) {
        System.out.println("enter number");
        System.out.println("where 0 is the end of the input");
        int[] arr1 = recIn(arr);
        recOut(arr1);
    }

    public static void recOut(int[] arr) {
        System.out.println(arr[index-arr.length]);
        index++;
        if (index/2 < arr.length){
            recOut(arr);
        }
    }

    public static int[] recIn(int[] arr) {
        String numStr = in.nextLine();
        int num = 0;
        if (numStr.equals("0")){
            return arr;
        } else {
            num = Integer.parseInt(numStr);
        }
        try {
            arr[index] = num;
        } catch (ArrayIndexOutOfBoundsException exception) {
            arr = copy(arr);
            arr[index] = num;
        }
        index++;
        return recIn(arr);
    }

    private static int[] copy(int[] arr) {
        int[] buffer = arr.clone();
        arr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            if (buffer.length <= i) {
                return arr;
            }
            arr[i] = buffer[i];
        }
        return arr;
    }
}
