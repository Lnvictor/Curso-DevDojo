package javacore.directorystream;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestDirectoryStream {
    public static void main(String[] args) {
        Path dir = Paths.get(".");

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            for (Path path : stream) {
                System.out.println(path.getFileName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
