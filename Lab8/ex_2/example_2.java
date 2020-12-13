package ex_2;

import java.util.Scanner;

public class example_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter number: ");

        int num = in.nextInt();
        System.out.println(outBinary(num));
    }

    public static String outBinary(int num){
        return num > 0 ? outBinary(num / 2) + (num % 2) : "";
    }
}
