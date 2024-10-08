package main;

import java.io.File;
import java.io.IOException;

public class ViDuTaoTapTinVaThuMuc {
	// Luu y:
	public static void main(String[] args) {

		// MS Windows: \ -> \\
		// Linux,MacOs : / -> /Thu muc 1/Thu muc 2/ Ten tap tin
		// Kiem tra co ton tai hay chua
		File folder1 = new File("C:\\Users\\Admin\\eclipse-workspace\\Java_67\\src");
		File folder2 = new File("C:\\Users\\Admin\\eclipse-workspace\\Java_68\\src");

		System.out.println("Kiem tra co ton tai hay khong: " + folder1.exists());
		System.out.println("Kiem tra co ton tai hay khong: " + folder2.exists());

		// tao thu muc
		// phuong thuoc mkdir()

		File d1 = new File("C:\\Users\\Admin\\eclipse-workspace\\Java_67\\src\\Directory_1");
		d1.mkdir(); // =>Da tao 1 thu muc xong

		// mkdirs =>tao nhieu thu muc cung luc

		File d2 = new File(
				"C:\\Users\\Admin\\eclipse-workspace\\Java_67\\src\\Directory_1\\Directory_2\\Directory_3\\Directory_4");
		// d2.mkdir(); //=>Da tao 1 thu muc xong
		d2.mkdirs(); // tao ra hang loat lien tuc, 1 ->2 ->3->4

		// Tao tap tin(co phan mo rong .exe,.txt,.doc,.xls ....)
		File file1 = new File("C:\\Users\\Admin\\eclipse-workspace\\Java_67\\src\\Directory_1\\Vidu1.txt");
		
		try {
			file1.createNewFile();
		} catch (IOException e) {
			//Không có quyền tạo tập tin
			//Ổ cứng bị đầy
			//Đường dẫn sai
			e.printStackTrace();
		}
	}
}
