package task_1.example_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class File_ByteRead_SamBuff {
    public static void readAllByByte(InputStream in) throws IOException {
        byte[] buff = new byte[5];
        while (true) {
            int oneByte = in.read(buff);
            if (oneByte != -1) {
                System.out.println("колличество = "+ oneByte + ", buff = "+ Arrays.toString(buff)
                        + ", str = "+ new String(buff, 0, oneByte, StandardCharsets.UTF_8));
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String fileName = "D:\\JavaProject\\labTen\\src\\task_1\\example_3\\file3.txt";
        try (InputStream inputStream = new FileInputStream(fileName)) {
            readAllByByte(inputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}