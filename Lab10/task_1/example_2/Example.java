package task_1.example_2;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Example {
    public static void readAllByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read();
            if (oneByte != -1) {
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + "end");
                break;
            }
        }
    }

    public static void main(String[] args) {
        try {
            InputStream inputFile = new FileInputStream("D:\\JavaProject\\labTen\\src\\task_1\\example_2\\file2.txt");
            readAllByByte(inputFile);
            System.out.print("\n\n\n");
            inputFile.close();

            InputStream inputUrl = new URL("https://www.google.ru/").openStream();
            readAllByByte(inputUrl);
            System.out.print("\n\n\n");
            inputUrl.close();

            InputStream inputArr = new ByteArrayInputStream(new byte[]{7,9,3,7,4});
            readAllByByte(inputArr);
            System.out.print("\n\n\n");
            inputArr.close();

        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}
