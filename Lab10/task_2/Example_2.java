package task_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;

public class Example_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out = null;
        try {
        /*Создание потоков*/
            br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\JavaProject\\labTen\\src\\task_2\\file1.txt"), "cp1251"));
            out = new PrintWriter("D:\\JavaProject\\labTen\\src\\task_2\\file2.txt", "cp1251");
        /*Переписывание информации из одного файла в другой*/
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                if (lineCount == 2) {
                    out.println(lineCount + ": " + s);
                }
                for (int i = 0; i < s.split(" ").length; i++) {
                    if (isNumberDouble(s.split(" ")[i])){
                        double d = Double.parseDouble(s.split(" ")[i]);
                        if (d>=0){
                            out.println(i + ": " + d);
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Алярм! Мистаке!!)");
        } finally {
            br.close();
            out.flush();
            out.close();
        }
    }
    public static boolean isNumberDouble(String s) {
        try {
            double i = Double.parseDouble(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}