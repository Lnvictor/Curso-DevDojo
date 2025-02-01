package javacore.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFilesAttributesTeste02 {
	public static void main(String[] args)  throws IOException {
		Path path  = Paths.get("pasta2/novo_texto.txt");
		BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
		
		System.out.println("CreationTime: " + basicFileAttributes.creationTime());
		System.out.println("Last Modified Time: " + basicFileAttributes.lastModifiedTime());
		System.out.println("Last Acess Time: " + basicFileAttributes.lastAccessTime());
		

		BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
		FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
		fileAttributeView.setTimes(basicFileAttributes.creationTime(), newCreationTime, basicFileAttributes.creationTime());
		
		BasicFileAttributes basicFileAttributes2 = Files.readAttributes(path, BasicFileAttributes.class);
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("CreationTime: " + basicFileAttributes2.creationTime());
		System.out.println("Last Modified Time: " + basicFileAttributes2.lastModifiedTime());
		System.out.println("Last Acess Time: " + basicFileAttributes2.lastAccessTime());
	}
}
