package curs31.file;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Exercitiu {

    public static void main(String[] args) throws IOException {
        File resources = new File("resources");
        delete(resources);
        create(resources);
        show(resources);
    }

    private static void show(File resources) {
        if(resources.listFiles() != null){
            File[] files = resources.listFiles();
            Arrays.stream(files).forEach(file -> {
                System.out.println(file);
                File[] listFiles = file.listFiles();
                if(listFiles != null){
                    Arrays.stream(listFiles).forEach(f -> System.out.println(f));
                }

            });
        }
    }

    private static void create(File resources) throws IOException {
        resources.mkdir();
        File backup = new File(resources, "backup");
        backup.mkdir();
        File currentResources = new File(resources, "currentResources");
        currentResources.mkdir();
        File app1 = new File(currentResources, "application.properties");
        app1.createNewFile();
    }

    private static void delete(File resources) {
        boolean delete = resources.delete();
        System.out.println("Folderul a fost sters: "+ delete);
        if(resources.listFiles() != null) {
            File[] files = resources.listFiles();

            for (File file : files) {
                if (file.isFile()) {
                    file.delete();
                } else {
                    File[] filesFromSubFolder = file.listFiles();
                    for (File file1 : filesFromSubFolder) {
                        file1.delete();
                    }
                    file.delete();
                }
            }
        }
        resources.delete();
    }
}
