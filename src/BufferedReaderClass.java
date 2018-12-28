import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderClass {

    public static void main(String[] args) {
        try{
            FileReader fileReader = new FileReader("C:\\Users\\angel\\Desktop\\JavaIO\\fileWriter.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuilder stringBuilder = new StringBuilder();
            int c;
            while ((c=bufferedReader.read()) != -1) {
                stringBuilder.append((char)c);
            }
            fileReader.close();
            bufferedReader.close();
            System.out.println(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

//        Using readLine
        try{
            FileReader fileReader = new FileReader("C:\\Users\\angel\\Desktop\\JavaIO\\fileWriter.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuilder stringBuilder = new StringBuilder();
            String tmp = bufferedReader.readLine();
            stringBuilder.append(tmp);
            fileReader.close();
            bufferedReader.close();
            System.out.println(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
