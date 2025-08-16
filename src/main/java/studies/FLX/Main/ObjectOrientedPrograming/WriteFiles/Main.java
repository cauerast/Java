package studies.FLX.Main.ObjectOrientedPrograming.WriteFiles;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String filePath = "test.txt";
        String fileContent = """
                I like pizza, pizza is very good
                I like you!!!!!!!!!!!!!!!!!!!!!!
                """;

        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(fileContent);
            System.out.println("File has been written");
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file location");
        }
        catch(IOException e){
            System.out.println("Could not write file");
        }

    }
}
