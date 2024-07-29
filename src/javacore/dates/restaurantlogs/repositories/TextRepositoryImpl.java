package javacore.dates.restaurantlogs.repositories;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class TextRepositoryImpl implements TextRepository {
    private static final String PATH = "C:\\Users\\victo\\personal\\git\\java-DevDojo\\src\\javacore\\dates\\restaurantlogs\\logs";

    @Override
    public void saveLog(String log) {
        String logFilename = "log.txt";
        String fullPath = PATH + File.separator + logFilename;

        File file = new File(fullPath);

        if (file.exists()) {
            try {
                Files.write(
                        Path.of(fullPath),
                        log.getBytes(),
                        StandardOpenOption.APPEND
                );
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public List<String> getAll() {
        String logFilename = "log.txt";
        String fullPath = PATH + File.separator + logFilename;
        File file = new File(fullPath);

        if (!file.exists()) {
            return List.of();
        }

        try {
            return Files.readAllLines(Path.of(fullPath));
        } catch (IOException e) {
            e.printStackTrace();
            return List.of();
        }
    }
}
