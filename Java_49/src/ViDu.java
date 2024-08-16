import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Nhap vao chuoi: ");
		s = sc.nextLine();
		System.out.println("-------");

		// hàm length() =>lấy độ dài chuỗi
		System.out.println(s.length());
		int doDai = s.length();

		// hàm charAt(vi tri ) => lấy ra 1 kí tự tại độ dài bất kỳ( trong độ dài của
		// chuỗi thôi)
		for (int i = 0; i < doDai; i++) {
			System.out.println("Vi tri " + i + " la: " + s.charAt(i));
		}

		// hàm getChars(vị trí bắt đầu, vị trí kết thúc,mảng lưu dữ liệu, vị trí bắt đầu
		// lâu của mảng)
		char[] arrayChar = new char[100];
		s.getChars(2, 4, arrayChar, 0);
		for(int i=0;i<arrayChar.length;i++)
		{
			System.out.println("Gia tri cua mang tai " + i + " la : "+ arrayChar[i]);
		}
		
		//ham getBytes => có 3 cách ,lấy ra giá trị của các ký tự thành 1 mảng
		byte[] arrayByte = s.getBytes();
		for(byte b : arrayByte)
		{
			System.out.println(b);
		}
	
		
			
	}
}
