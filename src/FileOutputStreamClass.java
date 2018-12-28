import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamClass {

    public static void main(String[] args) {
        String text = "Howdy mate? You wanna beer?";
        byte[] bytes = text.getBytes();
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream("C:\\Users\\angel\\Desktop\\JavaIO\\fileOutputStream.txt");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found !");
        } catch (IOException e) {
            System.out.println("Error while writing the data to the disk");
        }
    }
}
