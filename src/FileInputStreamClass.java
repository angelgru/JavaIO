import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamClass {

    public static void main(String[] args) {
        FileInputStream fileInputStream;
        StringBuilder stringBuilder = new StringBuilder();
        try{
            fileInputStream = new FileInputStream("C:\\Users\\angel\\Desktop\\JavaIO\\FileOutputStream.txt");
            int i;
            while((i = fileInputStream.read()) != -1)
                stringBuilder.append((char)i);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(stringBuilder.toString());
    }
}
