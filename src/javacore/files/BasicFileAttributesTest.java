package javacore.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest {
	public static void main(String[] args) throws IOException {
		
		LocalDateTime date = LocalDateTime.now();
		File file = new File("pasta2/novo.txt");
		file.createNewFile();
		
		boolean isModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());
		
		
		Path newPath = Paths.get("pasta2/novo_texto.txt");
		Path newFile = Files.createFile(newPath);
		
		Files.setLastModifiedTime(newFile, FileTime.from(date.toInstant(ZoneOffset.UTC)));
	
		System.out.println(Files.isWritable(newFile));
		System.out.println(Files.isReadable(newFile));
		System.out.println(Files.isExecutable(newFile));
		System.out.println(Files.getLastModifiedTime(newFile));
	}
}
