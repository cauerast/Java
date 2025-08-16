package studies.FLX.Main.ObjectOrientedPrograming.ReadFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // How to read a file using Java

        // BufferedReader + FileReader: best for reading text files line by line
        // FileInputStream: best fot binary files (e.g, images, audio)
        // RandomAccessFiles: best for read/write specific portions of a large file

        String filePath = "D:\\Github\\Java\\src\\main\\java\\studies\\FLX\\Files\\test.txt";



        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Could not locate file");
        }
        catch (IOException e) {
            System.out.println("Something went wrong");
        }
    }
}
