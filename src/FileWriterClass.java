import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {

    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\angel\\Desktop\\JavaIO\\fileWriter.txt");
            String txt = "Using FIleWriter for writing to a file without the need for converting from characters to bytes";
            fileWriter.write(txt);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
