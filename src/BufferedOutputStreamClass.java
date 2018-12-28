import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamClass {

    public static void main(String[] args) {
        FileOutputStream fileOutputStream;
        BufferedOutputStream bufferedOutputStream;
        try {
            fileOutputStream = new FileOutputStream("C:\\Users\\angel\\Desktop\\JavaIO\\fileOutputStream.txt");
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            String data = "Howdy mate,I am using BufferedOutputStream for writing stream of data using a buffer for efficiency";
            bufferedOutputStream.write(data.getBytes());
            bufferedOutputStream.flush();
            fileOutputStream.close();
            bufferedOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
