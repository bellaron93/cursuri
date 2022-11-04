package curs31.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        File resource = new File("resource");
        if(!resource.exists()){
            resource.mkdir();
        }
        File app = new File(resource, "application.properties");
        if(!app.exists()){
            app.createNewFile();
        }

        try (FileInputStream inputStream = new FileInputStream(app);
             BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream)){
            inputStream.skip(2);
            byte[] bytes = new byte[15];
            inputStream.read(bytes);
            System.out.println(new String(bytes));
        }catch (Exception e){

        }
//        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

    }
}
