package javacore.exceptions.lavarapido.service;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileService {
    public static final String LOG_FILE = "C:\\Users\\victo\\personal\\git\\java-DevDojo\\src\\javacore\\exceptions\\lavarapido\\log";

    public boolean saveOnLogFile(String text, String id) {
        String completedFilePath = LOG_FILE + File.separator + String.format("%s.txt", id);
        File file = new File(completedFilePath);

        try {
            if (!file.exists()) {
                boolean newFile = file.createNewFile();
            }

            Path path = Path.of(file.getPath());
            Files.write(path, String.format("[ID: %s] - Chamada de metodo: %s\n", id, text).getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }
}
