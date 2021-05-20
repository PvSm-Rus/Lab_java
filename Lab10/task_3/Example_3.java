package task_3;

import java.io.*;

public class Example_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out = null;
        try {
            /*Создание потоков*/
            br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\JavaProject\\labTen\\src\\task_3\\file1.txt")));
            out = new PrintWriter("D:\\JavaProject\\labTen\\src\\task_3\\file2.txt");
            /*Переписывание информации из одного файла в другой*/
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                String[] arr = s.split(" ");
                int rowCount = 0;
                for (String value : arr) {
                    if (!value.matches("(?ui:[^аеёиоуыэюя]).*")) {
                    } else {
                        out.print(value + " ");
                        rowCount++;
                    }
                }
                out.println("\n Колличество слов в строке " + lineCount + ": " + rowCount);
            }
        } catch (IOException e) {
            System.out.println("Алярм! Мистаке!!)");
        } finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
