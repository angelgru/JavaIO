import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamClass {

    public static void main(String[] args) {
        FileInputStream fileInputStream;
        BufferedInputStream bufferedInputStream;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            fileInputStream = new FileInputStream("C:\\Users\\angel\\Desktop\\JavaIO\\FileOutputStream.txt");
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            int c;
            while((c = bufferedInputStream.read()) != -1)
                stringBuilder.append((char)c);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(stringBuilder.toString());
    }
}
