import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("C:\\Users\\angel\\Desktop\\JavaIO\\fileWriter.txt");
            StringBuilder stringBuilder = new StringBuilder();
            int c;
            while((c=fileReader.read()) != -1) {
                stringBuilder.append((char)c);
            }
            System.out.println(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
