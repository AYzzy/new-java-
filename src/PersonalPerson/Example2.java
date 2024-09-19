package PersonalPerson;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Example2 {
    public static void main(String[] args) {
        File file = CreateFile("scr/foots.txt");
        try{
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter writer = new PrintWriter(fileWriter);
            writer.println("Hello");
            writer.println("world");
            writer.flush();
            writer.close();
        }catch (IOException E){
            System.out.println(E.getMessage());
        }
    }

    private static File CreateFile(String path) {
        try{
            File file = new File(path);
            if(!file.exists()) {
                file.createNewFile();
            }
            return file;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new IllegalStateException(e);
        }
    }
}
