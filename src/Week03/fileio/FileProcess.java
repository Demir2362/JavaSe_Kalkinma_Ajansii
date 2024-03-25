package Week03.fileio;

import java.io.File;
import java.io.IOException;
public class FileProcess {
    public static void main(String[] args) throws IOException {
        File directory = new File( "myDir");
        boolean bool = directory .mkdir();
        System.out.println(bool);


        File file = new  File(directory, "file");
        bool = file.createNewFile();
        System.out.println(bool);
       bool=  directory.delete();
    }
}
