package PersonalPerson;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ExampleFiles {
    public static void main(String[] args) {
        try{
            File file = new File("src/foot.txt");
            if(!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
                System.out.println(e.getMessage());;
        }

    }
}
