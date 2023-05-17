//此类用于各种疑难理论测试，成功后可使用branch功能进行实际测试
//现在正在测试：网络编程

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class MkTest {
    public static void main(String[] args) throws IOException {
    }

    public static void encrypt() throws IOException {
        String fileName = new Scanner(System.in).nextLine();
        FileInputStream fis = new FileInputStream("D:\\" + fileName);
        FileOutputStream fos = new FileOutputStream("D:\\" + fileName + "_Decrypted");
        int b;
        while ((b = fis.read()) != -1) fos.write(b ^ 114514);
        fos.close();
        fis.close();
    }

    public void decrypt() throws IOException {
        String fileName = new Scanner(System.in).nextLine();
        FileInputStream fis = new FileInputStream("D:\\" + fileName + "_Decrypted");
        FileOutputStream fos = new FileOutputStream("D:\\" + fileName);
        int b;
        while ((b = fis.read()) != -1) fos.write(b ^ 114514);
        fos.close();
        fis.close();
    }
}
