import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterClass {

    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\angel\\Desktop\\JavaIO\\fileWriter.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String txt = "Writing data using BufferedWriter";
            bufferedWriter.write(txt);
            bufferedWriter.flush();
            fileWriter.close();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
