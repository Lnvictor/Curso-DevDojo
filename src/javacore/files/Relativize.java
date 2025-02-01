package javacore.files;

import java.nio.file.Paths;
import java.nio.file.Path;

public class Relativize {
	public static void main(String[] args) {
		Path dir = Paths.get("/home/william");
		Path clazz = Paths.get("/home/outrocaminho");
		
		Path diretorio1 = Paths.get("/a/bb");
		Path diretorio2 = Paths.get("/li/a");
		
		Path diretorio3 = Paths.get("/a/bb/s/x");
		Path diretorio4 = Paths.get("/a/bb/s/u");
		
		System.out.println(dir.relativize(clazz));
		System.out.println(diretorio1.relativize(diretorio2));
		System.out.println(diretorio3.relativize(diretorio4));
	}
}
