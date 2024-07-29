package javacore.exceptions.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\victo\\personal\\git\\java-DevDojo\\src\\arquivo\\teste.txt");
        try {
            Boolean created = file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
