package curs31.file;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        //separatorul dintr foldere
        System.out.println(File.separator);

        File resources = new File("resources");
        resources.mkdir();
        System.out.println(Arrays.toString(resources.listFiles()));
        File f1 = new File(resources, "application.properties");
        if(f1.exists()){
            f1.delete();
        }
        f1.createNewFile();

        System.out.println(f1.getAbsolutePath());

        if(f1.canWrite()){
            System.out.println("putem sa scriem");
        } else {
            System.out.println("trebuie sa dam drepturi");
            f1.setWritable(true);
        }
    }
}
