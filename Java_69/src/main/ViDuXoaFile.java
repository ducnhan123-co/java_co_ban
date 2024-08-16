package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class ViDuXoaFile {
	
	public static void xoaFile(File fx)
	{
		if(fx.isFile()) {
			//Xoa neu la tap tin
			System.out.println("Da xoa: " + fx.getAbsolutePath());
			fx.delete();
		}
		//Lay cac file con
		else if(fx.isDirectory()) {
			File[] mangCon = fx.listFiles();
			for (File f : mangCon) {
				//Xoa cac file con
				xoaFile(f);
			}
			//Xoa ban than thu muc sau khi xoa file con
			System.out.println("Da xoa: " + fx.getAbsolutePath());
			fx.delete();
		}
	}
	
	
	public static void main(String[] args) {
		// Su dung class File
		File f0 = new File("C:\\Users\\Admin\\eclipse-workspace\\Java_69");
		File f0_1 = new File("C:\\Users\\Admin\\eclipse-workspace\\Java_69\\F0_1");
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\Java_69\\ViDu.txt");

		f0.delete();
		f0.deleteOnExit(); // khong xoa duoc tai trong do co file

		f0_1.deleteOnExit(); // xoa duoc vi thu muc rong
		f.deleteOnExit();
		System.out.println(f0_1.delete());
		
		ViDuXoaFile.xoaFile(f0);
		
		
		//Su dung class Files xoa tap tin va thu muc
		Path p0 = f0.toPath();
		Path p0_1 = f0_1.toPath();
		Path p_vidu = f.toPath();
		try {
			//Files.deleteIfExists(p0);
			Files.deleteIfExists(p0_1);
			Files.deleteIfExists(p_vidu);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}