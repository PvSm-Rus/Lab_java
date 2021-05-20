package task_1.example_7;

import java.io.*;

public class Buf_RW_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter wr = null;
        try {
            br = new BufferedReader(new FileReader("D:\\JavaProject\\labTen\\src\\task_1\\example_7\\file1.txt"), 1024);
            wr = new BufferedWriter(new FileWriter("D:\\JavaProject\\labTen\\src\\task_1\\example_7\\file2.txt"));
            int lineCount = 0;
            String s;
            while ((s=br.readLine())!= null){
                lineCount++;
                System.out.println(lineCount + ": " + s);
                wr.write(s);
                wr.newLine();
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            br.close();
            wr.flush();
            wr.close();
        }
    }
}