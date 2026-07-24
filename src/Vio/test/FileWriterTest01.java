package Vio.test;
//File
//FileWriter
//FileReader

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fileWriter = new FileWriter(file);
             BufferedWriter br = new BufferedWriter(fileWriter)){
            br.write("Eu sou gostosooooooooooooooooooooooooooooooo");
            file.delete();
            br  .flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
