import java.io.File;
import java.io.IOException;

public class FileClass {

    public static void main(String[] args) {
//        file is  an abstract representation of a file path
        File file = new File("C:\\Users\\angel\\Desktop\\JavaIO\\file.txt");
        try{
            if(file.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File already existed !");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        Listing files in directory
        File directory = new File("C:\\Users\\angel\\Desktop\\JavaIO");
        String[] filesInDirectory = directory.list();
        for(String s: filesInDirectory) {
            System.out.println(s);
        }

//        Getting the file locations from directory
        File[] filesDirectory = directory.listFiles();
        for(File f: filesDirectory) {
            System.out.println(f.getAbsolutePath());
        }
    }
}
