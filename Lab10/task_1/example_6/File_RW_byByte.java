package task_1.example_6;

import java.io.*;

public class File_RW_byByte {
    public static void main(String[] args) throws IOException {

        try (Reader in = new FileReader("D:\\JavaProject\\labTen\\src\\task_1\\example_6\\file1.txt");
             Writer out = new FileWriter("D:\\JavaProject\\labTen\\src\\task_1\\example_6\\file2.txt", true)) {
             /*файл для чтения
             файл для записи
             Данные считываются и записываются побайтно, как и для
             InputStream/OutputStream*/
            int oneByte; /* переменная, в которую считываются данные*/
            while ((oneByte = in.read()) != -1) {
                /*out.write((char)oneByte); запись с уничтожением ранее существующих данных*/
                out.append((char) oneByte); /* запись с добавлением данных в конец*/
                System.out.print((char) oneByte);
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!! ");
        }
    }
}