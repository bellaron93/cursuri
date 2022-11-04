package curs31.io;

import java.io.*;

public class Exercitiu {

    public static void main(String[] args) throws IOException {
        File inputFile = new File("resource/input.jpg");
        File outputFile = new File("resource/output.jpg");
        if(!outputFile.exists()){
            outputFile.createNewFile();
        }

        try (FileInputStream inputStream = new FileInputStream(inputFile);
             FileOutputStream outputStream = new FileOutputStream(outputFile)){
            int b = 0;
            byte[] bytes = inputStream.readAllBytes();
            outputStream.write(bytes);
           /* while (b != -1){
                b = inputStream.read();
                System.out.println(b);
                if(b == 171){
                    outputStream.write(205);
                }else {
                    outputStream.write(b);
                }
            }*/

        }catch (Exception e){

        }
//        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

    }
}
